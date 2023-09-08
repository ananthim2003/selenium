package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fascbooktest {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Ananthi");
		driver.findElement(By.name("lastname")).sendKeys("M");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8667626781");
		
		driver.findElement(By.id("password_step_input")).sendKeys("ananthima");
		
		WebElement day=driver.findElement(By.id("day"));
		Select day1=new Select(day);
		day1.selectByValue("10");
		
		
		WebElement month=driver.findElement(By.id("month"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Mar");
		
		
		WebElement year=driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByValue("2003");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.close();

		
		
		
	
	}

}
