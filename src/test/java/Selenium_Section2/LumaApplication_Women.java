package Selenium_Section2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LumaApplication_Women {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\Automation_Selenium\\Selenium_Part1\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000); // if you comment Thread.sleep then you are bound to get "ElementNotInteractableException" here..
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement women = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).perform();
		WebElement tops = driver.findElement(By.xpath("//span[text()='Tops']"));
		act.moveToElement(tops).perform();
		WebElement jackets = driver.findElement(By.xpath("//span[text()='Jackets']"));
		act.moveToElement(jackets).perform();
		jackets.click();
		WebElement clickOnJacket = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[2]"));
		clickOnJacket.click();
		WebElement colorOfJacket = driver.findElement(By.xpath("(//div[@class='swatch-option color'])[2]"));
		colorOfJacket.click();
		WebElement m_size = driver.findElement(By.xpath("(//div[@class='swatch-option text'])[5]"));
		m_size.click();
		WebElement addToCart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		addToCart.click();
		WebElement actualMessageAddress = driver
				.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
		String actualMessage = actualMessageAddress.getText();
		String expectedMessage = "You added Juno Jacket to your shopping cart.";
		if (actualMessageAddress.isDisplayed()) {
			System.out.println("Selected product has been added to cart MESSAGE displayed successfully..");
			System.out.println();
			System.out.println("Actual validation message is : " + actualMessage);
			System.out.println();
			if (actualMessage.equals(expectedMessage)) {
				System.out.println("Actual message : \n" + actualMessage + "\n" + "Expected message :\n"
						+ expectedMessage + "\n" + "both are same ");
			} else {
				System.out.println("Actual message : \n" + actualMessage + "\n" + "Expected message : \n"
						+ expectedMessage + "\n" + "both are NOT same ");
			}

		} else {
			System.out.println("Selected product has been added to cart message is not getting displayed ..");
		}
		driver.close();
	}
}
