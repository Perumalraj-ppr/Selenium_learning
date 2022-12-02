package selenium_Basics_LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Radio_Example {

	static void RadioButton() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");

		// 1.select yes/no radio button
		WebElement yesno = driver.findElement(By.id("yes"));
		yesno.click();

		// 2.get default selection
		WebElement unchecked = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
		boolean selected = unchecked.isSelected();
		boolean selected2 = checked.isSelected();
		System.out.println("unchecked is:" + selected + "   " + "checked is:" + selected2);

		// 3.select age group
		WebElement agegroup = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		agegroup.click();

	}

	public static void main(String[] args) {
		RadioButton();
	}
}
