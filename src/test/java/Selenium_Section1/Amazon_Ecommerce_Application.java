
package Selenium_Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_Ecommerce_Application {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
//		WebElement ele = driver.findElement(By.id("twotabsearchtextbox")); // we have to perform two operations on on
//																			// same address so store in a variable
//																			// called WebElement...
//		ele.sendKeys("Iphone");
//		ele.submit(); // instead of using search button we can use submit method in case of search
//						// box...
//		driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Blue']")).click();
		

		WebElement ele1 = driver.findElement(By.name("field-keywords"));
		ele1.sendKeys("IPHONE");
		Thread.sleep(3000);
		ele1.clear();
		
		
		ele1.sendKeys("IPHONE");
		Thread.sleep(3000);
		ele1.clear();
	
		ele1.sendKeys("IPHONE");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Blue']")).click();

	}
}
