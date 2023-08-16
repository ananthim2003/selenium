package week5.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) {
		//Step 1: To open the ChromeDriver
				ChromeDriver driver =new ChromeDriver();
				
				//Step 2: Load the Application Url as https://www.tamilmatrimony.in/ 
				driver.get("https://www.tamilmatrimony.in/ ");
				
				//Step 3: Maximize the Browser
				driver.manage().window().maximize();
				
				//add implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Step 4: Select the Matrimony profile for YourSelf
				WebElement profile=driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
				Select profile1=new Select(profile);
				profile1.selectByVisibleText("Myself");
				
				//Step 5: Enter Name
				driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Ananthi");
				
				//Step 6: Click on Gender
				driver.findElement(By.id("genderfemale")).click();
				
				//Step 7: Select your Date of Birth
				//date
				WebElement birth=driver.findElement(By.xpath("//select[@id='DOBDAY']"));
				Select birth1=new Select(birth);
				birth1.selectByValue("10");
				
				//month
				WebElement month=driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
				Select month1=new Select(month);
				month1.selectByVisibleText("Mar");
				//year
				WebElement year=driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
				Select year1=new Select(year);
				year1.selectByValue("2003");
				
				//Step 8: Select your Religion
				WebElement religion=driver.findElement(By.xpath("//select[@id='RELIGION']"));
				Select religion1=new Select(religion);
				religion1.selectByVisibleText("Hindu");
				
				//Step 10: Select your Mother Tongue
				WebElement tongue=driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
				Select tongue1=new Select(tongue);
				tongue1.selectByVisibleText("Tamil");
				
				//Step 11: Select your counrt 
				WebElement counrt=driver.findElement(By.xpath("//select[@id='COUNTRY']"));
				Select counrt1=new Select(counrt);
				counrt1.selectByVisibleText("India");
				
				//Step 12: Enter your MobileNumber
				driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("8667625781");
				
				//Step 13: Enter your E-mail ID
				driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("20g109ananthi.m@gmail.com");
				
				//Step 14: Close the Browser
				driver.close();
				
				
		
		
		
		

	}

}
