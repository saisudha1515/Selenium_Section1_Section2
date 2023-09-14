package Selenium_Section1;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.geckodriver.driver", "./Resources.geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://twitter.com/");
		driver.get("https://www.amazon.com/");
	}
}
