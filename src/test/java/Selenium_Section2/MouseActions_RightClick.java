package Selenium_Section2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseActions_RightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		Actions act = new Actions(driver);
		Thread.sleep(5000);
//		act.contextClick(ele).perform();
//                         or
		act.moveToElement(ele).contextClick().build().perform();

	}

}
