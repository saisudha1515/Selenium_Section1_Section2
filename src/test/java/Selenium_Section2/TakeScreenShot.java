package Selenium_Section2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class TakeScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		TakesScreenshot sh = (TakesScreenshot) driver;
		File source = sh.getScreenshotAs(OutputType.FILE);
		File destFile = new File("E:\\Automation_Selenium\\TakeScreenShot\\prerana.png");
		Files.copy(source, destFile);
		System.out.println("The Google Screen shot has been taken Successfully ");
		
		/// Amazon Application
		
		driver.get("https://www.amazon.in/");
		TakesScreenshot sh1 = (TakesScreenshot) driver;
		File source1 = sh1.getScreenshotAs(OutputType.FILE); // take from java.io
		File destination = new File("E:\\Automation_Selenium\\TakeScreenShot\\sujatha.png");
		Files.copy(source1, destination);      // Files is coming from com.google.common.io
		System.out.println("The Amazon screen has taken successfully..");
		// or
		 
	//	Files.copy(sh1.getScreenshotAs(OutputType.FILE), new File("E:\\Automation_Selenium\\TakeScreenShot\\img4.png"));
	}
}
