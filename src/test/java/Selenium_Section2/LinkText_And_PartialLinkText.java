// LInkText An dPartialLinkTest mostly will be one of one we no need to check it again. But when we use link text or partial link text , the link should not be broken.. 
// Actually link text and partial link test are not preferable(because of doubt of broken links..) go for xpath..

package Selenium_Section2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkText_And_PartialLinkText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.linkText("Gmail")).click();
//		driver.findElement(By.partialLinkText("Gma")).click();

		driver.get("https://www.amazon.in/");
		// driver.findElement(By.linkText("Amazon miniTV")).click();
		driver.findElement(By.partialLinkText("Amazon mi")).click();

	}
}
