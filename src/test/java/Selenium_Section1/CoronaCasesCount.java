// Write a Script to go to Corona Worldometer and print the cases in console...
package Selenium_Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class CoronaCasesCount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		String virusName = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']")).getText();
		System.out.println("The name and subject are      : " + virusName);
		String noOfCoronaCases = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/following-sibling::div/span")).getText();
		System.out.println("Number of Cororna Cases are   : " + noOfCoronaCases);
		System.out.println();
		String deathText = driver.findElement(By.xpath("//h1[text()='Deaths:']")).getText();
		System.out.println("Death Text Printing           : " + deathText);
		String deathCount = driver.findElement(By.xpath("//h1[text()='Deaths:']/following-sibling::div/span")).getText();
		System.out.println("Corona Death Count is         : " + deathCount);
		System.out.println();
	    String recoveredText = driver.findElement(By.xpath("//h1[text()='Recovered:']")).getText();
		System.out.println("Recovered text is              : "+recoveredText);
		String recoveryCount = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../following-sibling::div[3]/div/span")).getText();
		System.out.println("Corona cases recovery Count is : "+recoveryCount);
		driver.close();
	}
}
