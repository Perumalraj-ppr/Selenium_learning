package selenium_Advanced_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SelectablesEample {
	static void Select() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.browserstack.com/guide/select-class-in-selenium");

		List<WebElement> button = driver.findElements(By.xpath("//*[@id=\'developers-menu-dropdown\']/li"));
		int buttonsize = button.size();
		System.out.println(buttonsize);
	}

	public static void main(String[] args) {
		Select();
	}
}