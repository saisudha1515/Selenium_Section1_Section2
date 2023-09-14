package Selenium_Section2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActios_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(5000);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement destination = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(source, destination).perform();
	}
}
