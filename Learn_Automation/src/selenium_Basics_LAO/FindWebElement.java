package selenium_Basics_LAO;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindWebElement {

	static void openmsedge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http:\\www.google.com");
	}

	static void openchrome() {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\new\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		//find element using Xpath attribute name & value
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("pmkisan"+Keys.ENTER);
		//find element using name
		driver.findElement(By.name("q")).sendKeys("amazon" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
	}

	public static void main(String[] args) {
		openchrome();
		// openmsedge();
	}
}