package selenium_Advanced_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame_Handling {

	static void frames() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");

		// 1.click [click me button] inside frame
		driver.switchTo().frame(0);
		WebElement clickme = driver.findElement(By.id("Click"));
		clickme.click();

		// 2.get tag name of click button
		String tagName = driver.findElement(By.id("Click")).getAccessibleName();
		System.out.println("you clicked inside frame button  :" + tagName);

		// 3.click button inside nested frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement click2 = driver.findElement(By.id("Click1"));
		click2.click();
		String accessibleName = driver.findElement(By.id("Click1")).getAccessibleName();
		System.out.println("you clicked inside nested frame button   :" + accessibleName);

		// 4.find number of frames
		driver.switchTo().defaultContent();
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		int size = totalframe.size();
		System.out.println("no of frames  :" + size);
	}

	public static void main(String[] args) {
		frames();
	}
}
