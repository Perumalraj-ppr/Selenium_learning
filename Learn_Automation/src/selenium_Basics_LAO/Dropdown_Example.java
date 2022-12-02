package selenium_Basics_LAO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Example {

	static void DropDown() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\OneDrive\\Desktop\\Perumal\\Edge driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");

		// 1.select dropdown using index
		WebElement index = driver.findElement(By.id("dropdown1"));
		Select choose = new Select(index);
		choose.selectByIndex(1);

		// 2.select dropdown using visible text or name
		WebElement name = driver.findElement(By.name("dropdown2"));
		Select name1 = new Select(name);
		name1.selectByVisibleText("Appium");

		// 3.select dropdown using value
		WebElement value = driver.findElement(By.xpath("//*[@id=\"dropdown3\"]"));
		Select value1 = new Select(value);
		value1.selectByValue("3");

		// 4.get no of options
		WebElement totaloption = driver.findElement(By.className("dropdown"));
		Select getoptions = new Select(totaloption);
		List<WebElement> alloptions = getoptions.getOptions();
		int size = alloptions.size();
		System.out.println("Totol no of options : " + size);

		// 5.select by sendkeys
		WebElement sendkey = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		sendkey.sendKeys("UFT/QTP");

		// 6.select all options
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiselectbox = new Select(multiselect);
		// multiselectbox.selectByIndex(0);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);
		multiselectbox.selectByIndex(4);
	}

	public static void main(String[] args) {
		DropDown();
	}
}
