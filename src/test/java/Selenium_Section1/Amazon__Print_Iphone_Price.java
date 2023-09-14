// Write a script to print the price of first IPHONE in Amazon e_commerce Application..
package Selenium_Section1;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon__Print_Iphone_Price {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
//		ele.sendKeys("Iphone");
//		ele.submit(); // we can use submit method for this search bar here because here, type="submit" is there..
//		String iphoneSymbol = driver.findElement(By.xpath("//img[@class='_bXVsd_image_1pfbQ']")).getText();//taken this one as static element to find the dynamic price.. // can't print symbol because it is a link not visible text. we are not having visible text for this in backend html code...
//		//System.out.println("The Iphone symbol and it's text is    : "+iphoneSymbol);
//		System.out.println();
//		String  iphoneName =  driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Blue']")).getText();
//		System.out.println("First IPHONE Name is                  : "+iphoneName);
//		System.out.println();
//		String price = driver.findElement(By.xpath("//img[@class='_bXVsd_image_1pfbQ']/../../../../../../../../../../following-sibling::div[2]/div/div/div/div/div/div/div/div/following-sibling::div/div/div/div[3]/div/div/div/div[2]/a/span/span/../span/following-sibling::span/span[2]")).getText();
//		System.out.println("First IPHONE Price is                 : RS."+price);
//		driver.close();
		
		// Sikuli Example::
//		Screen screen = new Screen();
//		Pattern maximizeWin = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\Maximize.PNG");
//		Pattern MuteBtn = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\Mute.PNG");
//		Pattern playBtn = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\PlayBtn.PNG");
//		Pattern volume = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\Volume.PNG");
//		Pattern subscribeBtn = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\Subscribe.PNG");
//		
////		WebDriverManager.firefoxdriver().setup();
////		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.youtube.com/watch?v=wfLXeVyz9Dk");
//		
//		screen.click(maximizeWin);
//		Thread.sleep(3000);
//		screen.click(MuteBtn);
//		Thread.sleep(3000);
//		screen.click(playBtn);
//		Thread.sleep(3000);
//		screen.click(volume);
//		Thread.sleep(3000);
//		screen.click(subscribeBtn);
		
		
		

	}
}
