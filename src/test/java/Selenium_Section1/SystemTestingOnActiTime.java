// Write a Script to  performing system testing in actiTime application...
// We use Thread.Sleep() to overcome the Synchronisation issue...

package Selenium_Section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SystemTestingOnActiTime {
	public static void main(String[] args) throws InterruptedException {

		Random r = new Random(); // when we can't create duplicate data. this class is coming from java.util
									// package..
		int x = r.nextInt(1000);
		String data = "RRR" + x;

		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);

		// Don't store the address of the locator in a variable(WebElement) when you
		// don't want to reuse the Address of locator...
		driver.findElement(By.cssSelector("input[class='textField']")).sendKeys("admin");

		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");

		driver.findElement(By.id("keepLoggedInCheckBox")).click();

		driver.findElement(By.cssSelector("a[class='initial']")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("a[class='content tasks']")).click();

		driver.findElement(By.cssSelector("div[class='addNewButton']")).click();

		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']"))
				.sendKeys(data);

		driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("Movie ");

		driver.findElement(By.cssSelector("div[class='commitButtonPlaceHolder']")).click();

		driver.findElement(By.className("logout")).click();
		driver.close();

//		WebElement userName = driver.findElement(By.cssSelector("input[class='textField']"));
//		userName.sendKeys("admin");
//
//		WebElement password = driver.findElement(By.cssSelector("input[class='textField pwdfield']"));
//		password.sendKeys("manager");
//
//		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
//		checkBox.click();
//
//		WebElement login = driver.findElement(By.cssSelector("a[class='initial']"));
//		login.click();
//		Thread.sleep(3000);
//
//		WebElement task = driver.findElement(By.cssSelector("a[class='content tasks']"));
//		task.click();
//		Thread.sleep(3000);
//
//		WebElement addNew = driver.findElement(By.cssSelector("div[class='addNewButton']"));
//		addNew.click();
//		Thread.sleep(3000);
//
//		WebElement newCustomer = driver.findElement(By.cssSelector("div[class='item createNewCustomer']"));
//		newCustomer.click();
//		Thread.sleep(3000);
//
//		WebElement enterCustomerName = driver
//				.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']"));
//		enterCustomerName.sendKeys("S");
//		
//
//		WebElement createAccount = driver.findElement(By.cssSelector("div[class='commitButtonPlaceHolder']"));
//		createAccount.click();
//
//		
//
//		WebElement logOut = driver.findElement(By.className("logout"));
//		logOut.click();
		driver.close();

	}

}
