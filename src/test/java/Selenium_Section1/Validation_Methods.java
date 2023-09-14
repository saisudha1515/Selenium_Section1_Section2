/////// Validation methods return type is boolean
package Selenium_Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));

		// isEnabled() method is used to validate the Attribute.if attribute is enabled/
		// present in the html code or not because some the html developer may disabled
		// the attribute..
		if (ele.isEnabled()) {
			System.out.println("Attribute is Present/Element is enabled..");
		} else {
			System.out.println("Element is not enabled");
		}

		// isSelected() method is used to check whether the check box is selected or
		// not..if check box is selected this method will return true else return false
		WebElement ele1 = driver.findElement(By.id("keepLoggedInCheckBox"));
		// ele1.click();
		if (ele1.isSelected()) {
			System.out.println("Check Box is selected ");
		} else {
			System.out.println("Check box is not selected ");
		}

		// isDisplayed()method is used validate a message whether a message is displayed
		// or not if message is displayed then it returns true else returns false..
		// driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.className("errormsg"));
		if (ele2.isDisplayed()) {
			System.out.println("Error Message is displayed ");
		} else {
			System.out.println("Error Message is not displayed ");
		}
		driver.close();
	}
}
