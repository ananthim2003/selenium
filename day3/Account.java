package week5.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account {

	public static void main(String[] args) {
		       //Step 1: To open the ChromeDriver
				ChromeDriver driver =new ChromeDriver();
				
				//Step 2: Load the Application Url as 'https://uibank.uipath.com/register-account'
				driver.get("https://uibank.uipath.com/register-account");
				
				//Step 3: Maximize the Browser
				driver.manage().window().maximize();
				
				//add implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Step 4: Enter your name
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ananthi");
				//Step 5: Select your title
				WebElement title=driver.findElement(By.xpath("//select[@id='title']"));
				Select title1=new Select(title);  
				title1.selectByVisibleText("Ms");
				
				//Step 6: Enter your Initial
				driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("M");
				//Step 7: Enter your Last Name
				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Murugan");
				//Step 8: Select Gender
				WebElement gender=driver.findElement(By.xpath("//select[@id='sex']"));
				Select gender1=new Select(gender);  
				gender1.selectByVisibleText("Female");
				//Step 9: Select   Employment Status by using selectByVisibleText()
				WebElement status=driver.findElement(By.xpath("//select[@id='employmentStatus']"));
				Select status1=new Select(status);
				status1.selectByVisibleText("Full-time");
				
				//Step 10: Enter your name
				driver.findElement(By.xpath("//input[@id='age']")).sendKeys("10/03/2003");
				// 11: Enter your EmailAddress
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("20g109ananthim@gmail.com");
				
				//Step 12: Enter your Password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ananthimurugan");
				
				//Step 13: Close your Browser
				driver.close();

	}

}
