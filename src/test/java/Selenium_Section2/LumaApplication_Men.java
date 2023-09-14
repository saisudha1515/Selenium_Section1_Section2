// Write a script for the below requirement. Go to Luno website and go to men/women >> tops >> select the size >> select color >> click on add to cart >> validate the message..
// when you unable to see the element what you inspect/when the element is inspectable but not visible when we try to find the address then we have to do debug.. means we have to freeze the web page..
// How to freeze ? --> sources -- click on >>(just beside sources)/ press Function+f8(or)control+f8 to freeze the web page and press the same key to un freeze the web page.. to freeze --> press Function+f8 3 to 4 times then only the screen will be freezed...
package Selenium_Section2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LumaApplication_Men {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000); // JVM(sleep for 3 seconds) will stop the execution for 3000 mills seconds.. if you comment Thread.sleep then you are bound to get "ElementNotInteractableException" here..
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mens = driver.findElement(By.xpath("//span[text()='Men']"));
		Actions act = new Actions(driver);
		act.moveToElement(mens).perform();
		WebElement tops = driver.findElement(By.xpath("(//span[text()='Tops'])[2]"));
		act.moveToElement(tops).perform();
		WebElement jocket = driver.findElement(By.xpath("(//span[text()='Jackets'])[2]"));
		act.moveToElement(jocket).perform();
		jocket.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1300);");
		Thread.sleep(3000);
	  // jse.executeScript("arguments[0].scrollIntoView();", jocket);
		WebElement clickOnShirt = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[11]"));
		clickOnShirt.click();
		WebElement shirtSize = driver.findElement(By.xpath("(//div[@class='swatch-option text'])[3]"));
		shirtSize.click();
		WebElement shirtColour = driver.findElement(By.xpath("(//div[@class='swatch-option color'])[2]"));
		shirtColour.click();
		WebElement addToCart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		addToCart.click();
		String expectedMessage = "You added Beaumont Summit Kit to your shopping cart.";
		WebElement actualMsssageAddress = driver
				.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
		String actualMessage = actualMsssageAddress.getText();
		if (actualMsssageAddress.isDisplayed()) {
			System.out.println("Added to cart MESSAGE is displaying successfully..");
			System.out.println();
			if (actualMessage.equals(expectedMessage)) {
				System.out.println("Actual message is :" + actualMessage);
				System.out.println();
				System.out.println("Actual message : \n" + actualMessage + "\n" + "Expected message : \n"
						+ expectedMessage + "\n" + "both are same");
			} else {
				System.out.println("Actual message : \n" + actualMessage + "\n" + "Expected message : \n"
						+ expectedMessage + "\n" + "both are NOT same");
			}
		} else {
			System.out.println("Added to cart MESSAGE is NOT displaying.. ");
		}
       //driver.close();
	}

}
