package Selenium_Section2;
import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Guru99_DropDown {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB, "admin123", Keys.TAB, Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		ele.sendKeys("SAISUDHA", Keys.TAB, "123456789", Keys.ENTER, Keys.TAB, Keys.ARROW_DOWN, Keys.DOWN, Keys.DOWN,
				Keys.ENTER, Keys.TAB, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER, Keys.TAB, "Amrutha");
	}

}
