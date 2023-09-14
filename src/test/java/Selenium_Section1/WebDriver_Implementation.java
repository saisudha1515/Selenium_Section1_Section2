//Scanner class is used to accept input from the User in run time from the Console ... and Scanner class is a predefined class in Java..which is coming from Java.util package..
package Selenium_Section1;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Implementation {
	public static void main(String[] args) {
		// Local variables initialization..
		ChromeDriver driver;  
		FirefoxDriver driver1;
		EdgeDriver driver2;
		System.setProperty("webdriver.chrome.driver",
				"E:\\Automation_Selenium\\JavaProject_Section1\\Server_DriverExecutableFilesForBrowsers\\chromedriver.exe");
		System.out.println("Enter the browser in which you want to open your Web Application");
		Scanner scanner = new Scanner(System.in); // in means input taking from user..
		// we know before that which type of data user is going to enter. if user enter
		// integer value use nextInt, if double use - nextDouble,if text
		// -nextLine()(i.e, text ni antha oka line lo pedatham so lint ani rayali)
		String browser = scanner.nextLine(); // storing user response in a variable /// nextLine() method returns
												// String.. so store in a variable..
		System.out.printf("You have selected %s brower to launch your web application \n", browser); // \n means next
																										// line
		scanner.close();// to avoid memory wastage..we have to close the scanner..

		if (browser.equals("chrome")) {
			driver = new ChromeDriver(); // local variables so must have to initialize..
		} else if (browser.equals("firefox")) {
			driver1 = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver2 = new EdgeDriver();
		}else {
			System.out.println("The web Apllication can't open in this browser ");
		}
       
	}
}

// so here, we have to create object for each and every browser separately..hence the code become lengthy. but we have to reuse the code that is the best practice it is possible with the help of "WEBDRIVER"


