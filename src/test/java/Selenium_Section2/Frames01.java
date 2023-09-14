package Selenium_Section2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Frames01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Actions act = new Actions(driver);

		

		// By using WebElement referance variable::
//		WebElement frame01 = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
//		driver.switchTo().frame(frame01);		
//		WebElement dragElement = driver.findElement(By.cssSelector("span[class='ui-slider-handle ui-corner-all ui-state-default']"));
//		act.dragAndDropBy(dragElement, 100, 0).perform();
		
		
		//By Using Index::
//		 driver.switchTo().frame(0);
//		 WebElement dragElement = driver.findElement(By.cssSelector("span[class='ui-slider-handle ui-corner-all ui-state-default']"));
//		 act.dragAndDropBy(dragElement, 500, 0).perform();
		
		//By Using id or class name::
//		driver.switchTo().frame(""); //write iframe name or id just like visible text..
//		WebElement dragElement = driver.findElement(By.cssSelector("span[class='ui-slider-handle ui-corner-all ui-state-default']"));
	}
}
