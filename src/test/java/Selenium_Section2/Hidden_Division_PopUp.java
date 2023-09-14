// Write a script for the below requirement. Log in to actiTime and click on task and then select the first checkbox under tasks i can manage and then handle the Hidden Division Popups...
package Selenium_Section2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hidden_Division_PopUp {
	public static void main(String[] args) throws InterruptedException {  // These pop ups are inspectable pop up so we no need to switch to alert()... hanble in a normal way..
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.TAB, Keys.SPACE, Keys.TAB,
				Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("div[class='img']")).click(); // total 25 elements are matching but we can take 1 st element since our element is first element..
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
		Thread.sleep(3000);
		WebElement message = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]"));
		String hiddenDivisionPopUpMessage = message.getText();
		System.out.println(hiddenDivisionPopUpMessage);
		
		// System.out.println(driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText());
	}
}
