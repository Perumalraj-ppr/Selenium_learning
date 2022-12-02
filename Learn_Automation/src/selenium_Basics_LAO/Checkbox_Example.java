package selenium_Basics_LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Example {
	static void CheckBox() {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

		// 1.select checkbox
		WebElement select = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		select.click();

		// 2.find checkbox is selected
		WebElement find = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		boolean selected = find.isSelected();
		System.out.println("selenium is selected" + selected);

		// 3.check the condition and deselect
		WebElement notselected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		if (notselected.isSelected()) {
			notselected.click();
		}

		WebElement iamselected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		if (iamselected.isSelected()) {
			iamselected.click();
		}

		// 4.select all checkboxes
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		WebElement option3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		WebElement option4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
		WebElement option5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]"));
		WebElement option6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]"));
		option1.click();
		option2.click();
		option3.click();
		option4.click();
		option5.click();
		option6.click();
	}

	public static void main(String[] args) {
		CheckBox();
	}
}
