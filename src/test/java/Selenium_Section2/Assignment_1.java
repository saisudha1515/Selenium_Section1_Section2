// Write a script for the below requirement.  GO to Amazon and click on All and then go to Programs & Features and Print the below items of that particular section..
package Selenium_Section2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("i[class='hm-icon nav-sprite']")).click();
		List<WebElement> allElements = driver.findElements(By.xpath(
				"//ul[@class='hmenu hmenu-visible']/li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li/following-sibling::li"));

		int count = 0;
		for (WebElement eachElement : allElements) {
			count++; // as soon as get the element just increase the count..
			if (count <= 4) {
				System.out.println(eachElement.getText());
			}

		}
		System.out.println("======================   or  ==============================");
		System.out.println();
		int count1 = 0;
		for (WebElement eachElement : allElements) {
			System.out.println(eachElement.getText());
			count1++;
			if (count1 > 3) {
				break;
			}

		}
	}
}
