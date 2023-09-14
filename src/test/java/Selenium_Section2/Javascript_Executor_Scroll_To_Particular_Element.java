package Selenium_Section2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javascript_Executor_Scroll_To_Particular_Element {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Up_casting
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver; // down_casting --> if up_casting is there then only we
																// can perform down_casting..
		WebElement ele = driver.findElement(By.xpath("//td[text()='Guyana']"));
		jse.executeScript("arguments[0].scrollIntoView();", ele); // scroll upto the ele address.. and most of the time
																// we check with 1 argument..i.e, index is 0
	}
}
