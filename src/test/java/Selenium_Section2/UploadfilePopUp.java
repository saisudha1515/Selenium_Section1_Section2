package Selenium_Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UploadfilePopUp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.cssSelector("button[class='uploadResume resman-btn-primary resman-btn-small']")).click();
		StringSelection ss = new StringSelection("C:\\Users\\saisu\\OneDrive\\Documents\\saisudhaResume .docx"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
