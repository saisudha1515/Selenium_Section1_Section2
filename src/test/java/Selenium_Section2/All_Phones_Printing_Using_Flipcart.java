// Write a Script to print all I-phones and Shampoos available in the web page in console using Flip-cart Application

package Selenium_Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Phones_Printing_Using_Flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement el = driver.findElement(By.name("q"));
		el.sendKeys("IPHONE");
		el.submit();
		Thread.sleep(5000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		System.out.println("Names Of all Iphones present in the web page are : \n ");
		for (WebElement eachElement : ele) {
			String allIphonesNames = eachElement.getText();
			System.out.println(allIphonesNames);
		}

		WebElement ele1 = driver.findElement(By.name("q"));
		ele1.sendKeys("Shampoos");
		ele1.submit();
		System.out.println();
		System.out.println("All Shampoos that are present in the web page are : \n");
		Thread.sleep(5000);
		List<WebElement> allShampoos = driver.findElements(By.xpath("//a[contains(text(),'Shampoo')]"));
		for (WebElement eachShampoo : allShampoos) {
			String eachShampo = eachShampoo.getText();
			System.out.println(eachShampo);
		}
	}
}
