package selenium_Basics_LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Button_Example {

	static void button() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\Perumal\\Edge driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

		// 1.find button position
		WebElement getxyposition = driver.findElement(By.id("position"));
		Point location = getxyposition.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("button x position is:" + x + "   " + "button y position is:" + y);

		// 2.find button colour
		WebElement buttoncolour = driver.findElement(By.id("color"));
		String cssValue = buttoncolour.getCssValue("background-color");
		System.out.println("button colour :" + cssValue);

		// 3.find height & width
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("button height is:" + height + "  " + "button width is :" + width);

		// 4.go to homepage
		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
	}

	public static void main(String[] args) {
		button();
	}
}
