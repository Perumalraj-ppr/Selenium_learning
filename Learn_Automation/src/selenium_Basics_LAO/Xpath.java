package selenium_Basics_LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\new\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:\\www.myntra.com");
		// LaunchBrowser();
		// By driver = null;
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("mens shirt");
		search.sendKeys(Keys.RETURN);
		// Thread.sleep(3000);
		WebElement search1 = driver.findElement(By.xpath(
				"//a[@href='shirts/roadster/roadster-men-blue--beige-regular-fit-checked-casual-shirt/6849354/buy']"));
		search1.click();
	}

	public static void main(String[] args) {
		// LaunchBrowser();
		// searchBar();
	}
}