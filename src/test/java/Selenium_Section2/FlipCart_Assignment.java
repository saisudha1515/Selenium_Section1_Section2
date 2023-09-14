// Write a script to go Flip-cart then go to electronics the navigate to gaming then click on games and print the first element name in console..
package Selenium_Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipCart_Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();

		} catch (Exception e) {
		}
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();
		WebElement gaming = driver.findElement(By.xpath("//a[text()='Gaming']"));
		act.moveToElement(gaming).perform();
		WebElement games = driver.findElement(By.xpath("//a[text()='Games']"));
		// act.moveToElement(games).perform();
		games.click();
		List<WebElement> allGamesNamesAddresses = driver.findElements(By.xpath("//div[@class='_4ddWXP']"));
		System.out.println("All Games Names and their details are : \n ");
		int count = 0;
		for (WebElement eachAddress : allGamesNamesAddresses) {
			String eachGameName = eachAddress.getText();
			System.out.println(eachGameName);
			System.out.println();
			count++;
		}
		System.out.println(count);
		System.out.println("==========================================================");

		// Only Game Names ::
		System.out.println("Only the game names are : \n ");
		List<WebElement> allGamesNamesAddresses1 = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		int count1 = 0;
		for (WebElement eachAddress1 : allGamesNamesAddresses1) {
			String eachGameName1 = eachAddress1.getText();
			System.out.println(eachGameName1);
			System.out.println();
			count1++;
		}
		System.out.println(count1);
	}
}
