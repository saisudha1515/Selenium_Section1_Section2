//Keys class will not work for alphabets and functional keys and to handle Stand alone application.. to overcome this we go for Robot class..
//How to perform Login by using single inspect ?
package Selenium_Section2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Key_Board_Handling_KeysClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.TAB, Keys.SPACE, Keys.ENTER);

	}
}

// Keys.TAB --> is for go to next web element..
// Keys.SPACE --> is to select the check box..
// Keys.ENTER --> is to used to login..


