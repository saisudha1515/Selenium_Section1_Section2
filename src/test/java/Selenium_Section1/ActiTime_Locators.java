package Selenium_Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
//
//		WebElement userName = driver.findElement(By.id("username"));
//		userName.sendKeys("admin");
//		Thread.sleep(3000);
//
//		WebElement password = driver.findElement(By.name("pwd"));
//		password.sendKeys("manager");
//		Thread.sleep(3000);
//
//		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
//		checkBox.click();
//		Thread.sleep(3000);
//
//		WebElement login = driver.findElement(By.id("loginButton"));
//		login.click();
//		Thread.sleep(3000);
//
//		String title = driver.getTitle();
//		// System.out.println(title);
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		Thread.sleep(3000);
//
//		WebElement addTask = driver.findElement(By.id("taskSearchControl_field"));
//		addTask.sendKeys("SAISUDHA");
//		Thread.sleep(3000);
//
	}
}
