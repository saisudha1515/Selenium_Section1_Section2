//Write a script to print all I_phones in console from Amazon web application..
package Selenium_Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown_Iphones {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		System.out.println("List of all Iphones present in Amazon Web Application \n");
		for (WebElement eachElement : ele) {
			String eachWebElement = eachElement.getText();
			System.out.println(eachWebElement);
		}
		driver.close();
	}
}
