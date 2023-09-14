// Switching in between multiple windows/tabs..
package Selenium_Section2;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowPopUps {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rapido.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.swiggy.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.zomato.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://twitter.com/i/flow/login?redirect_after_login=%2F");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://toolsqa.com/");
		String mainID = driver.getWindowHandle(); // this method will store only one id/ main id which is pointed by web
													// driver referance variable..
		Set<String> allIDs = driver.getWindowHandles(); // this method will store allIDs which all tabe are opened at
														// that particular point of instance..
		for (String eachID : allIDs) {
			String title = driver.switchTo().window(eachID).getTitle();
			//System.out.println(title);

			if (title.contains("r Mobiles, Books, Watches, Shoes and More - Amazon.in  ")
					|| (title.contains("Online Shopping Site for Mobiles, Electron"))) { // if you take equals method
					driver.close();																		// then exact title should
				//System.out.println(title);
																		// be match..if you take
																							// contains method it will
																							// search for that specified
																							// text in the original text

			}

		}
	}
}
