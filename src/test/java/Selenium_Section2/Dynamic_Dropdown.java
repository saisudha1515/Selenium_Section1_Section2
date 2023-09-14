package Selenium_Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Katrina");
		Thread.sleep(3000); // if we don't give Thread.sleep here the web elements will not print..
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li")); // store the address of
																								// first element..

		System.out.println("All Katrina Khaif related searches are :: \n ");
		for (WebElement eachElement : ele) {
			String eachWebElement = eachElement.getText();
			System.out.println(eachWebElement);
		}
	}
}
