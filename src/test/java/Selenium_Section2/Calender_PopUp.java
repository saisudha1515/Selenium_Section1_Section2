package Selenium_Section2;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_PopUp {
	public static void main(String[] args) {
		// To load Calendar with current time and date and the return type of getInstance() is Calendar
		Calendar calender = Calendar.getInstance();
		// System.out.println(calender); // giving all unnecessary details along with date and time..

		calender.add(Calendar.DAY_OF_MONTH, 730);  // Calendar class is coming from java.util package..
		
		// To capture only time and date
		
		Date date = calender.getTime(); // Date is coming from java.util package.. and the return type of getTime() is Date..
		
		// To format the date in required date format use SimpleDateFormat class and in which pass required date format and by using format()format the date into the specified date format..format() return type is String...
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
		String formattedDate = sdf.format(date);// i want to format the date into my required date format.. and return type of format method is String..
        System.out.println("The Formatted date : "+formattedDate);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
        driver.findElement(By.id("datepicker")).sendKeys(formattedDate);
      
        //  driver.findElement(By.id("datepicker")).sendKeys(formattedDate,Keys.ENTER);

	}
}
