package Selenium_Section1;
import org.openqa.selenium.edge.EdgeDriver;
public class LaunchEdgeBrowser {
	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E:\\Automation_Selenium\\Selenium_Part1\\Resources\\geckodriver.exe");
		//System.setProperty("webdriver.msedge.driver", "./Resources/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://twitter.com/");
		driver.get("https://www.amazon.com/");
		driver.get("https://www.way2news.com/");
}
}
