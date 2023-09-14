package Selenium_Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Mynthra_ECommerce_Application {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement ele1 = driver.findElement(By.cssSelector("input[class='desktop-searchBar']"));
		ele1.sendKeys("book");
		Thread.sleep(3000);
//		ele1.clear();
//		Thread.sleep(3000);
//		ele1.sendKeys("BOOK");
//		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();

//		WebElement ele = driver.findElement(By.cssSelector("input[class='desktop-searchBar']"));
//		ele.sendKeys("IPHONE");
//		ele.submit();  //*** here type="Submit" is not there so can't use submit(); ***
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[title='Doodle Hardbound Ruled Diary with Pen Loop']")).click();
		Thread.sleep(3000);
		String str = driver.findElement(By.xpath("//h1[text()='Doodle']")).getText();
		Thread.sleep(3000);
		System.out.println("The book data printing form web application to console : "+str);

	}
}
