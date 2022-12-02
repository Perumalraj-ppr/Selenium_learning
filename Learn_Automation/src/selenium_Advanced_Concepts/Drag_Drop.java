package selenium_Advanced_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	static void dragDrop() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");

		// driver.switchTo().frame(0)
		WebElement from = driver.findElement(By.id("form:drag"));
		WebElement to = driver.findElement(By.id("form:drop"));

		Actions action = new Actions(driver);

		action.clickAndHold(from).moveToElement(to).release().build().perform();

	}

	public static void main(String[] args) {
		dragDrop();
	}
}
