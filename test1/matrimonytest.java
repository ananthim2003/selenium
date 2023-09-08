package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class matrimonytest {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		 
		driver.get("https://www.tamilmatrimony.in/ ");
		
	     driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement profile=driver.findElement(By.id("REGISTERED_BY"));
		Select profile1=new Select(profile);
		profile1.selectByVisibleText("Myself");
		
		driver.findElement(By.id("NAME")).sendKeys("Ananthi");
		
		driver.findElement(By.xpath("//label[@for='genderfemale']")).click();
		
		WebElement day=driver.findElement(By.id("DOBDAY"));
		Select day1=new Select(day);
		day1.selectByValue("10");
		
		
		WebElement month=driver.findElement(By.id("DOBMONTH"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Mar");
		
		
		WebElement year=driver.findElement(By.id("DOBYEAR"));
		Select year1=new Select(year);
		year1.selectByValue("2003");
		

		WebElement religion=driver.findElement(By.className("selectfield"));
		Select religion1=new Select(religion);
		religion1.selectByVisibleText("Hindu");
		
		WebElement tongue=driver.findElement(By.id("MOTHERTONGUE"));
		Select tongue1=new Select(tongue);
		tongue1.selectByVisibleText("Tamil");

		WebElement country=driver.findElement(By.id("COUNTRY"));
		Select country1=new Select(country);
		country1.selectByVisibleText("India");
		
		
		driver.findElement(By.id("MOBILENO")).sendKeys("8667625781");
		
		driver.findElement(By.id("EMAIL")).sendKeys("ananthima2003@gmail.com");
		
		driver.close();

	}

}
