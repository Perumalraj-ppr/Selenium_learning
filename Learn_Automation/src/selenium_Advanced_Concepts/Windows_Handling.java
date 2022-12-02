package selenium_Advanced_Concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Windows_Handling {

	static void windowHandel() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");

		String oldwindow = driver.getWindowHandle();

		// 1. open home page
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();

		Set<String> allwindows = driver.getWindowHandles();
		for (String newwindow : allwindows) {
			driver.switchTo().window(newwindow);
		}
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		edit.click();
		driver.close();

		driver.switchTo().window(oldwindow);

		// 2.find number of opened windows
		WebElement multipleWindow = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		multipleWindow.click();
		int size = driver.getWindowHandles().size();
		System.out.println("number of windows opened :" + size);

		// close all opened window except current window
		WebElement donotclose = driver.findElement(By.id("color"));
		donotclose.click();
		Set<String> allwindowHandles = driver.getWindowHandles();
		for (String openedwindows : allwindowHandles) {
			if (!openedwindows.equals(oldwindow)) {
				driver.switchTo().window(openedwindows);
				driver.close();
			}
		}

		driver.switchTo().window(oldwindow);
		WebElement waitbutton = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		waitbutton.click();
		Set<String> allrecentwindows = driver.getWindowHandles();
		for (String currentwindows : allrecentwindows) {
			if (!currentwindows.equals(oldwindow)) {
				driver.switchTo().window(currentwindows);
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		windowHandel();
	}
}