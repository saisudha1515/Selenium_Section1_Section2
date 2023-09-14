package Selenium_Section1;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open browser and store the browser instance in the variable called
													// "driver"
		driver.get("https://www.facebook.com/");
		driver.get("https://twitter.com/");
		driver.get("https://www.amazon.com/");
	}
}
//for chrome and edge drivers we have to check the versions but we no need to check the version for firefox driver since it is automatically take the latest version...