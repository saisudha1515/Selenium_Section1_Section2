package Selenium_Section2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_Scoll_DragAndDrop_ExplicitWait_Flipcart_Price {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000); // if the element will not found by using implicit wait, then use Thread.sleep()
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("iphone");
		ele.submit();
		Thread.sleep(3000);
	//	WebElement ele2 = driver.findElement(By.xpath("//div[@class='_3FdLqY']"));  //here the scroll may not be duplicate in future also.... don't take number unless we don't have any another option.. or when you are sure that the element will never change in future.. that time we can take an attribute value which has number in it ..
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='_3FdLqY']"));
		WebElement ele3 = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele2, 100, 0).perform(); // Moving in Forward direction so take positive x and here we are moving only x value so take y axis as 0 ....X value from stating point,,, Here we are having only X axis so, take only X axis value and make y axis value as 0
		Thread.sleep(3000);
		act.dragAndDropBy(ele3, -60, 0).perform();  // Moving in back-word direction so take negative value 
		
		/*
		 *       **  Explicit Wait **
		 *       
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
	     WebElement ele1 = driver.findElement(By.xpath("//div[@class='_3FdLqY']/../following-sibling::div/div"));
	     act.dragAndDropBy(ele1, -150, 0).perform();
	     
		*/
	}

}
