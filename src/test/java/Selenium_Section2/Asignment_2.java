// Write a script for the below requirement. Open n number of tabs and close all other tabs and keep only one tab ?
package Selenium_Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment_2 {
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
		Set<String> allTabs = driver.getWindowHandles();
		System.out.println(
				"==========   keeping only one tab(i.e, first tab/window,i.e, Amazon site) and closing remaining all other tabs    =================");
		int count = 0;
		for (String eachId : allTabs) {
			driver.switchTo().window(eachId); // as soon as switch to another tab just increase the count..
			count++;
			if (count > 1) {
				driver.close();
			}

//		}
//		System.out.println("==============     keeping 4 tab i.e, Tools QA, Twitter, Amazon, Zomato, Swiggy    ============");
//		System.out.println();
//		for (String eachTab : allTabs) {
//			String title = driver.switchTo().window(eachTab).getTitle();
//			if (title.contains("urniture, Grocery, Lifestyle, Books & More. Best Offer")) {
//				driver.switchTo().window(eachTab);
//				driver.close();
//			}
//			if (title.contains("Gift Cards online | recharge.com")) {
//				driver.switchTo().window(eachTab);
//				driver.close();
//			}
//
//			if (title.contains("g in or sign up")) {
//				driver.switchTo().window(eachTab);
//				driver.close();
//			}
//
		}

	}

}
