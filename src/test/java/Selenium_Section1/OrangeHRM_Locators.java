package Selenium_Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");

		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		Thread.sleep(3000);
		driver.close();
	}
}
