package Selenium_Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipcart_Application {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement ele = driver.findElement(By.cssSelector("input[autocomplete='off']"));
		ele.sendKeys("iphone");
		ele.submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']")).click();
		String str = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']")).getText();
		System.out.println(str);
		driver.close();
		
	}
}
