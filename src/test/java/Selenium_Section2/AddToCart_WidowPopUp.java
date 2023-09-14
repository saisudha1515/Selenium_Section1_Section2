// Write a script for the below requirement. Go to Flipcart website and search for iphone and then click on first iphone and then add that product to the cart..(i.e, click on add to cart)
package Selenium_Section2;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddToCart_WidowPopUp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
		}
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Iphone");
		ele.submit();
		driver.findElement(By.xpath(
				"//div[@class='_1YokD2 _2GoDe3 col-12-12']/following-sibling::div/div/div/div/a/div/following-sibling::div/div/div"))
				.click();
		Set<String> allIds = driver.getWindowHandles();
		String mainId = driver.getWindowHandle();
		for (String eachId : allIds) {
			if (!mainId.equals(eachId)) {
				driver.switchTo().window(eachId);  // addToCart is present in another window so, to perform add to cart operation first we need to switch to that window..
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			}

		}
	}
}
