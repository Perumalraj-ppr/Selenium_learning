package selenium_Basics_LAO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Example {

	static void alert() throws InterruptedException {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");

		// 1.alert box
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// 2.confrim box
		WebElement confrimbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confrimbox.click();
		Alert confrimalert = driver.switchTo().alert();
		// confrimalert.dismiss();
		confrimalert.accept();

		// 3.promt box
		WebElement promtbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promtbox.click();
		Alert promtalert = driver.switchTo().alert();
		promtalert.sendKeys("perumalraj");
		Thread.sleep(3000);
		promtalert.accept();

	}

	public static void main(String[] args) throws InterruptedException {
		alert();
	}
}
