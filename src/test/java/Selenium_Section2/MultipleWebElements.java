// Write a Script to print all div html tags in console using Amazon Application
package Selenium_Section2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWebElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		 List<WebElement> ele = driver.findElements(By.xpath("//*")); //it will get all html tags present in the web page
		//List<WebElement> ele = driver.findElements(By.xpath("//div")); // Multiples elements are coming so, store in a list which means here we have to use findElements()method..

		Thread.sleep(4000);
		int count = 0;
		System.out.println("All anchor tags available in web page are : \n ");
		for (WebElement eachEle : ele) {
			String eachElement = eachEle.getText();
			System.out.println(eachElement);
			count++; // as soon as print the web element just increase the count.. }
		}
		System.out.println(count);
	}
}
