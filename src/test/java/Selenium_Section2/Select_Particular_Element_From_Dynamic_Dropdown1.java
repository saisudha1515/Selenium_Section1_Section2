// Write a script to open Amazon web application and search for flower and click on flower plants for home garden..
package Selenium_Section2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Select_Particular_Element_From_Dynamic_Dropdown1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("flower");

		Thread.sleep(5000);
		List<WebElement> ele2 = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		System.out.println("List of Dynamic dropdown for Flower ....\n ");
		for (WebElement eachFlo : ele2) {
			System.out.println(eachFlo.getText());
		}
		System.out.println();
		Thread.sleep(5000);
		System.out.println("Select PARTICULAR element from the Dynamic dropdown..");
		System.out.println("=======================================");

		Thread.sleep(3000);
		List<WebElement> ele3 = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		for (WebElement i : ele3) {
			String eachFlowe = i.getText();
			if (eachFlowe.contains("garden")) {
				Thread.sleep(3000);
				i.click();
				break;
			}

		}
	}
}
