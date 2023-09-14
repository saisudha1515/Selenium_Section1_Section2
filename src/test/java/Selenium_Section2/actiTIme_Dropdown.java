package Selenium_Section2;  
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class actiTIme_Dropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Random class will generate random numbers and will be used when we can't
		// create duplicate data.. and it is coming form java.util package..

		Random r = new Random();
		int num = r.nextInt(100); // number will be generated in between 0 to 100
		String data = "Seetharaamam" + num;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "manager", Keys.TAB, Keys.SPACE,
				Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='content tasks']")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.cssSelector("[class='inputFieldWithPlaceholder newNameField inputNameField']"))
				.sendKeys(data);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("It is a Telugu Movie");
		driver.findElement(By.xpath("//div[text()='- Select Customer -']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='Galaxy Corporation']")).click();
		Thread.sleep(3000);
		TakesScreenshot sh = (TakesScreenshot) driver;
		File source = sh.getScreenshotAs(OutputType.FILE);
		File destFile = new File("E:\\Automation_Selenium\\TakeScreenShot\\img3.png");
		Files.copy(source, destFile);
		System.out.println("The Screen shot has been taken Successfully ");

		WebElement secondCheckBox = driver.findElement(By.xpath("(//input[@id='copyAssignedUsers'])[4]"));
		if (secondCheckBox.isSelected()) {
			secondCheckBox.click();
		}
		WebElement thirdCheckBox = driver.findElement(By.xpath("(//input[@id='copyProjectDescription'])[3]"));
		if (thirdCheckBox.isSelected()) {
			thirdCheckBox.click();
		}
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		WebElement validatioMesssageAddress = driver.findElement(By.xpath("//span[@class='innerHtml']"));  // perform isDisplayed() on web element address not on text ....
		String validatioMesssage = validatioMesssageAddress.getText();
		if (validatioMesssageAddress.isDisplayed()) {
			System.out.println("The message is getitng displayed in web page ");
			System.out.println("The validation message is : "+validatioMesssage);
		}
		else {
			System.out.println("The message is not getitng displayed in web page ");
		}
	}
}
