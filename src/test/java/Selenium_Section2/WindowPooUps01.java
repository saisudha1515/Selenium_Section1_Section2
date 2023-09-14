// Switching in only between 2 tabs/windows 
package Selenium_Section2;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowPooUps01 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		String mainID = driver.getWindowHandle();
		java.util.Set<String> allIDs = driver.getWindowHandles();
		for(String eachID:allIDs) {
			if(!mainID.equals(eachID)) {
				driver.switchTo().window(eachID);
			}
		}
	}
}
