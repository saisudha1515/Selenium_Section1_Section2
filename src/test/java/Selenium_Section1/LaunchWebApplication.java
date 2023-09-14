package Selenium_Section1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchWebApplication {
	public static void main(String[] args) throws InterruptedException {

		// Set System Path
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");

		// Browser Launch
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);

		// Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Launch Web Application
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);

		// Get Web Page Title (for validation)
		String title = driver.getTitle();
		System.out.println(title);

		// Capture Web page current URL (to know where my script will fail)
		String url = driver.getCurrentUrl();
		System.out.println(url);

		/*
		 * Browser Control Methods : 4 i.e, setSize(), setPosition(), Maximize(),
		 * Minimize()
		 * -----------------------------------------------------------------------------
		 * ----
		 */

		// Resize the Browser
		Dimension dim = new Dimension(100, 600); // width, length
		driver.manage().window().setSize(dim);
		// driver.manage().window().setSize(new Dimension(100,100));
		Thread.sleep(5000);

		// Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Set the Starting point or Position of browser
		Point p = new Point(400, 150);
		driver.manage().window().setPosition(p);
		// driver.manage().window().setPosition(new Point(508, 159));
		Thread.sleep(5000);

		// Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// Minimize the browser
		driver.manage().window().minimize();
		Thread.sleep(5000);

		// Close the Browser
		driver.close();

	}

}
