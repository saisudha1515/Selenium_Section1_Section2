package Selenium_Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Samsung_Price_Printing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("SAMSUNG");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String mobileName = driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).getText();
		System.out.println("SAMSUNG first Mobile Name         : " + mobileName);
		String price = driver.findElement(By.xpath("//span[text()='Samsung Galaxy M14 5G (ICY Silver, 6GB, 128GB Storage) | 50MP Triple Cam | 6000 mAh Battery | 5nm Octa-Core Processor | 12GB RAM with RAM Plus | Android 13 | Without Charger']/../../../../div/following-sibling::div[2]/div/div/div/div/a/span/span/span/following-sibling::span")).getText();
		System.out.println("Price of the first SAMSUNG Mobile : RS." + price);
		System.out.println();
		String mobileName2 = driver.findElement(By.xpath("//span[text()='Samsung Galaxy S23 5G (Green, 8GB, 256GB Storage)']")).getText();
		System.out.println("SAMSUNG second Mobile Name        : " + mobileName2);
		String price2 = driver.findElement(By.xpath("//span[text()='Samsung Galaxy S23 5G (Green, 8GB, 256GB Storage)']/../../preceding-sibling::div/../../div/following-sibling::div[2]/div/div/div/div/following-sibling::div/a/span/span/following-sibling::span/span[2]")).getText();
		System.out.println("Price of second SAMSUNG Mobile    : RS." + price2);
		driver.close();

	}
}
