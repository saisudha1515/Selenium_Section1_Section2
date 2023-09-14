package Selenium_Section1;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver.navigate().to("https://twitter.com/");
		Thread.sleep(3000);

		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);

		// Back to the previous website
		driver.navigate().back();
		Thread.sleep(3000);

		// Forward Method(), will go to following website
		driver.navigate().forward();
		Thread.sleep(3000);

		// Refresh the webpage
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
	}
}
