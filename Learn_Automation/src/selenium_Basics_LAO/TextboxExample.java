package selenium_Basics_LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TextboxExample{

	static void openmsedge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElement(By.className("wp-categories-title")).click();

		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("perumalraj.ppr@gmail.com");

		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbox.sendKeys("Text Added");

		WebElement getattribute = driver.findElement(By.name("username"));
		String attribute = getattribute.getAttribute("value");
		System.out.println(attribute);

		WebElement clearbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearbox.clear();// hear we can't use by.name, because we already used same user name.

		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = disabledbox.isEnabled();
		System.out.println(enabled);

		//driver.quit();
	}

	public static void main(String[] args) {
		openmsedge();
	}
}
