// If we use Robot class to perform scrolling in web application, we don't know how much scrolling is happening in the web page. So to overcome this issue with the help of Java Script Executor..
package Selenium_Section2;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
public class Scroll_Handling_ByUsing_Robot_Class {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
}
