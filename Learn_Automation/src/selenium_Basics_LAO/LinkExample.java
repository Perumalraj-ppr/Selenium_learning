package selenium_Basics_LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkExample {
	static void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		// driver.get("http:\\www.google.com");
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");

		/* WebElement homepage = */ driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Find where am supposed")).click();

	}

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
	}
}
