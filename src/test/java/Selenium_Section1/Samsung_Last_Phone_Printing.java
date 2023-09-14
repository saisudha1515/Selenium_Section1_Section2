//Write a script to print the last Samsung phone name and it's price by using Amazon web application..

package Selenium_Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Samsung_Last_Phone_Printing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("samsung");
		driver.findElement(By.id("nav-search-submit-button")).click();
		// searchBar.submit(); // type = "submit" is there so we can use submit() method for search bar..
		String lastPhoneName = driver.findElement(By.xpath(
				"//span[text()='Redmi 12C (Lavender Purple, 4GB RAM, 64GB Storage) | High Performance Mediatek Helio G85 | Big 17cm(6.71) HD+ Display with 5000mAh(typ) Battery']"))
				.getText();
		System.out.println("Samsung last phone name is          : " + lastPhoneName);
		System.out.println();
		String symbolOfRupee = driver.findElement(By.xpath(
				"//span[text()='Redmi 12C (Lavender Purple, 4GB RAM, 64GB Storage) | High Performance Mediatek Helio G85 | Big 17cm(6.71) HD+ Display with 5000mAh(typ) Battery']/../../../following-sibling::div[2]/div/div/div/div/a/span/span[2]/span"))
				.getText();
		System.out.println("Symbol of rupee is                  : " + symbolOfRupee);
		System.out.println();
		String priceOfLastPhone = driver.findElement(By.xpath(
				"//span[text()='Redmi 12C (Lavender Purple, 4GB RAM, 64GB Storage) | High Performance Mediatek Helio G85 | Big 17cm(6.71) HD+ Display with 5000mAh(typ) Battery']/../../../following-sibling::div[2]/div/div/div/div/a/span/span[2]/span[2]"))
				.getText();
		System.out.println("Price Of the last Samusung Phone is : " + symbolOfRupee+priceOfLastPhone);
		driver.close();
	}
}
