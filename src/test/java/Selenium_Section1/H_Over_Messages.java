// H-Over Messages are un_inspectable messages so, we can't handle those messages directly..to handle such kind of messages we have to use getAttribute()method and it returns String..
// getAttribute()method will store attribute value for that particular attribute name( i.e, if we pass attribute name it will give attribute value)
// H-over-messages means the messages will appear only when we mouse over on the particular element, (once we move away from the element the message will disappear) and the messages will get disappear as soon as we perform any mouse operation...  

package Selenium_Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class H_Over_Messages {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement el = driver.findElement(By.cssSelector("[placeholder='Password']"));
		String passwordHOverMessage = el.getAttribute("class"); // if we pass attribute name getAttribute() will store it's attribute value..
		System.out.println("Password text box H-Over-Message : " + passwordHOverMessage);
		System.out.println();
		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
		String hOverMessage = ele.getAttribute("title");
		System.out.println("Check box h-over-message : " + hOverMessage);
		driver.close();
	}

}
