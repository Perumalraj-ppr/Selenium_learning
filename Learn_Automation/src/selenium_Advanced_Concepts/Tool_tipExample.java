package selenium_Advanced_Concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tool_tipExample {
	static void orangeHRMLogin() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement username = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
		username.sendKeys("Admin");

		// WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");

		WebElement clickbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		clickbutton.click();

	}

	static void toolTip() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");

		Thread.sleep(3000);
		WebElement tooltip = driver
				.findElement(By.xpath("//a[@title='Home']"));
		String attributename = tooltip.getAttribute("title");
		System.out.println("HomeButton tooltip name = "+attributename);
	}

	public static void main(String[] args) throws InterruptedException {
		toolTip();
	}
}
// oxd-toaster_1