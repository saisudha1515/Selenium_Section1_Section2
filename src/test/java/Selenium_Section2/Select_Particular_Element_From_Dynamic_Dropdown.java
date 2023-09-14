
package Selenium_Section2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Select_Particular_Element_From_Dynamic_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("flower", Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//span[contains(text(),' Flower ')]"));
		System.out.println("All the web elements which are having flower name in the web page are.. \n ");
		for (WebElement eachFlowerName : ele1) {
			String eachFlower = eachFlowerName.getText();
			System.out.println(eachFlower);
		}

	}
}
