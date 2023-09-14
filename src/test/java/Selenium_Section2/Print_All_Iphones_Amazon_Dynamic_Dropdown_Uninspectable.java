//// Write a Script to print all Iphone names in console using Amazon Application
/* When Elements are not inspectable means, when we try to inspect the element in dynamic dropdown, the element got disappear. So, in such cases we have go to html code > Event Listeners > blur
in such cases we have go to html code > Event Listeners > blur and remove the things present in the blur.... then we can inspect the dynamic dropdown..
*/

package Selenium_Section2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Iphones_Amazon_Dynamic_Dropdown_Uninspectable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("samsung");
		ele.submit();
		Thread.sleep(10000);
		List<WebElement> ee = driver.findElements(By.xpath("//span[contains(text(),'Samsung')]"));
		System.out.println("Names of all Iphones Using Amazon Application..\n ");
		int count = 0;
		for (WebElement eachElement : ee) {
			String eachEle = eachElement.getText();
			System.out.println(eachEle);
			count++;
		}
		System.out.println();
		System.out.println("The total number of web elements are : "+count);
	}

}
