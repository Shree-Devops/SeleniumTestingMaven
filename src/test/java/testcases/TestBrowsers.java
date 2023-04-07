package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\Applications\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org");
		Select select = new Select (driver.findElement(By.xpath("//select[@id='searchLanguage']")));
		select.selectByValue("hi");
		select.selectByIndex(1);
		//select.selectByVisibleText("Hindi");
		List <WebElement> dropDownValues = driver.findElements(By.tagName("option"));//storing all values from dropdown
		dropDownValues.size();// size of the list containing dropdown values
		dropDownValues.get(6).getText(); // text of the 7th element in the dropdown list
		dropDownValues.get(6).getAttribute("id"); //will get id attribute i.e. value of the specified attribute.
		for (int i=0; i<dropDownValues.size(); i++) {// printing all the value of dropdown
			System.out.println(dropDownValues.get(i).getText());
		}
		// text of all links on the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			link.getText();
		}
		
	}
}
