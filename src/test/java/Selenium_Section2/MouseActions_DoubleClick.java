package Selenium_Section2;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseActions_DoubleClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Iphone");
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform(); // if we want to perform any mouse action we must have to use perform() method else we can't perform the mouse action..means in Actions calss perform() method is Mandatory..
	    Robot r = new Robot();
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_BACK_SPACE);
	    Thread.sleep(3000);
	    ele.sendKeys("Headphone",Keys.ENTER);

	}
}
