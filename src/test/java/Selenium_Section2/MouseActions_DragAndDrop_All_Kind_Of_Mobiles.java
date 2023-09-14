/////// If we want to print the name which we given in the search bar we can print.. only name in the send keys will change but html code is same for all types of element which you are passing in the sendKeys in that particular web application..
// suppose i have taken amazon web application and i have taken, in that application the html code is same for all kind of mobiles only the mobile name changes..
/// How to print only the mobile names and do not print the extra things... 

package Selenium_Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class MouseActions_DragAndDrop_All_Kind_Of_Mobiles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Iphones");
		// ele.sendKeys("Pens");
		Thread.sleep(5000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		System.out.println("Dynamic Dropdown :: ");
		System.out.println("-----------------------");
		int count = 0;
		for (WebElement eachEle : ele1) {
			String eachElement = eachEle.getText();
			System.out.println(eachElement);
			count++;
		}
		System.out.println();
		System.out.println("The count of web elements are : " + count);
		System.out.println("=========================================================================");

////////// it print only Text not the images 
		// Print all details of Mobile

		ele.submit();
		List<WebElement> ele2 = driver
				.findElements(By.xpath("//span[text()='Results']/../../../../../following-sibling::div"));
		int count1 = 0;
		for (WebElement eachEle2 : ele2) {
			String eachElement2 = eachEle2.getText();
			System.out.println(eachElement2);
			count1++;
		}
		System.out.println();
		System.out.println("The count of web elements are : " + count1);

		System.out.println("=============================================================================");
		// Print only mobiles not all unnecessary data, for this first inspect on mobile
		// name and then take xpath with class name.. The html tag/code will be same ,
		// it will not change only the mobile name changes in sendKeys()
		List<WebElement> allMobileAddresses = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		// List<WebElement> allPensAddresses =
		// driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base
		// a-text-normal']"));

		System.out.println("Only the names of Mobile which are present in the webpage are : ");
		System.out.println("---------------------------------------------------------");
		System.out.println();
		int counts = 0;
		for (WebElement eachMobileAddress : allMobileAddresses) {
			String eachMobileName = eachMobileAddress.getText();
			System.out.println(eachMobileName);
			System.out.println();
			counts++;
		}
		System.out.println("Count : " + counts);
		System.out
				.println("===========================================================================================");

		// How to print only mobile names ? --> first find the xpath to print all mobile
		// details and from there to find mobile name and try to go to that element.
		List<WebElement> ele4 = driver
				.findElements(By.xpath("h2[class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		int count2 = 0;
		for (WebElement eachMobileAddress1 : allMobileAddresses) {
			String eachMobileName1 = eachMobileAddress1.getText();
			System.out.println(eachMobileName1);
			System.out.println();
			count2++;
		}
		System.out.println();
		System.out.println("Count : " + count2);

	}
}
