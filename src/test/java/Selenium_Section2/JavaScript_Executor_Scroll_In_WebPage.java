// With help of Java Script Executor we can perform Scrolling and also we can get to know that " how much scrolling is happening in the web application and also how much scrolling is required in order to reach the specific web element..
package Selenium_Section2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript_Executor_Scroll_In_WebPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeAsyncScript("window.scrollBy(0,5000);"); // this method will also work 
		jse.executeScript("window.scrollBy(0,5000);");  // this is more preferable than the above method..   
	}
}
