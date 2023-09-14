package Selenium_Section2;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.TAB, Keys.SPACE, Keys.TAB,
				Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='menuTable']/div/following-sibling::div/div/div/div/div")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys("Anupama");
		driver.findElement(By.cssSelector("input[type='button']")).click(); // our element is first out of four elements so we can take..
		Thread.sleep(3000);
	   // driver.switchTo().alert(); // webdriver referance variable(i.e,driver)is pointing to the parent window id so, parent to alert popup we need to switch.. and Alert return type is Alert Interface..which means we are storing the referance of alert in a Alert alt referance variable and perform alert actions on alert ref.variable..
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[type='button']")).click();
//		Thread.sleep(3000);
//	    System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(3000);
//	    driver.switchTo().alert().accept();
//	   //// driver.switchTo().alert().sendKeys("saisudha");   // to enter text in alert pop up...
		
		
		
		//=========================================================
	Alert alt =	driver.switchTo().alert();
	System.out.println(alt.getText());
	Thread.sleep(3000);
	alt.dismiss();
	driver.findElement(By.cssSelector("input[type='button']")).click();
	Thread.sleep(3000);
	Alert alt1 = driver.switchTo().alert();
	alt1.accept();
	
	}
}
