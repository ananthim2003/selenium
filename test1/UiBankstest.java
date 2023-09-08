package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBankstest {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		 
		driver.get("https://uibank.uipath.com/register-account");
		
	     driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("firstName")).sendKeys("Ananthi");
		
		WebElement title=driver.findElement(By.id("title"));
		Select title1=new Select(title);
		title1.selectByVisibleText("Ms");
		
		driver.findElement(By.id("middleName")).sendKeys(".");
		
		driver.findElement(By.id("lastName")).sendKeys("M");
		
		WebElement gender=driver.findElement(By.id("sex"));
		Select gender1=new Select(gender);
		gender1.selectByVisibleText("Female");
		
		WebElement status=driver.findElement(By.id("employmentStatus"));
		Select status1=new Select(status);
		status1.selectByVisibleText("Full-time");

		driver.findElement(By.id("age")).sendKeys("10/03/2003");
		
		driver.findElement(By.id("email")).sendKeys("ananthima2003@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("ananthima");
		
		driver.close();
		}

}
