package Selenium_Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Guru99_Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/selenium/newtours/register.php");
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("SAISUDHA");
		Thread.sleep(3000);

		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("DODDI");
		Thread.sleep(3000);

		WebElement phoneNbr = driver.findElement(By.name("phone"));
		phoneNbr.sendKeys("7893266369");
		Thread.sleep(3000);

		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("saisudhayaleti@gmail.com");
		Thread.sleep(3000);

		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("RUDRAMPETA");
		Thread.sleep(3000);

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("ANANTAPUR");
		Thread.sleep(3000);

		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("ANDHRA PRADESH");
		Thread.sleep(3000);

		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("515004");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.name("country"));
		Select s = new Select(ele);
		//s.selectByIndex(39);  // Select class index will start from zero(0).. ex: if i want 30th element from dropdown then give 29 as index number beacuse the jvm starts counting from 0.
		//s.selectByVisibleText("CAMBODIA");
		s.selectByValue("CAMBODIA");

		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("saisudhasreevasthava");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123@sai");
		Thread.sleep(3000);

		WebElement confimPassword = driver.findElement(By.name("confirmPassword"));
		confimPassword.sendKeys("123@sai");
		Thread.sleep(3000);

//		WebElement submit = driver.findElement(By.name("submit"));
//		submit.click();
//		Thread.sleep(3000);
//
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.navigate().forward();
//		Thread.sleep(3000);
//
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.navigate().refresh();
//		Thread.sleep(3000);

	}


}
