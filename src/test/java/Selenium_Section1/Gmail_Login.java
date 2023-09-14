// Write a script to login into your G-mail account.. Exam  (have to do)
package Selenium_Section1;
import org.asynchttpclient.netty.request.NettyRequestSender;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?dsh=S-117221365%3A1688211456130311&authuser=0&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.id("identifierId")).sendKeys("d.saisaisudha@gmail.com");
		driver.findElement(By.cssSelector("[class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
		
	}
}
