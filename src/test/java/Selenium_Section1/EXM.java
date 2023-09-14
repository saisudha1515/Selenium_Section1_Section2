package Selenium_Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class EXM {
	public static void main(String[] args) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://scptest.saddlepointtech.com");
	 WebElement username=driver.findElement(By.xpath("//input[@id='username1']"));
	 username.sendKeys("training1.sp@gmail.com");
	 Thread.sleep(3000);
	 WebElement pass=driver.findElement(By.xpath("//input[@id='password1']"));
	 Thread.sleep(3000);
	 pass.sendKeys("Saddle@12");
	 Thread.sleep(3000);
	 WebElement button=driver.findElement(By.xpath("//input[@id='loginBtn1']"));
	 button.click();
	  Actions a = new Actions(driver);
 	  WebElement menuOption_s = driver.findElement(By.linkText("Network Optimizer"));
 	a.moveToElement(menuOption_s).build().perform();
 	WebElement logout = driver.findElement(By.id("src='./img/main/logout1.png']"));
 	a.contextClick(logout).perform();

	}
	

}
