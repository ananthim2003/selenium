package week5.day3;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		//Step 1: To open the ChromeDriver
		ChromeDriver driver =new ChromeDriver();
		
		//Step 2: Load the Application Url as 'https://www.facebook.com/'
		driver.get("https://www.facebook.com/");
		
		//Step 3: Maximize the Browser
		driver.manage().window().maximize();
		
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step 4: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//Step 5: Enter first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ananthi");
	
		//Step 6: Enter last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
		
		//Step 7: Enter your mobile number
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8567625781");
		
		
		//Step 8: Enter your password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Ananthimurugan");
		//Step 9:select date
		
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select date1=new Select(date);  
		date1.selectByValue("10");
		
		//Step 10: Select month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select month1=new Select(month);  
		month1.selectByVisibleText("Mar");
		
		//Step 11: Select year
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select year1=new Select(year);  
		year1.selectByVisibleText("2003");
		
		
		//Step 12: Click on your Gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//Step 13: Close your Browser
		//driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.close();

	}

}
