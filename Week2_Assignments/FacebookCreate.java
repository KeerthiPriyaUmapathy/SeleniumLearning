package week2.assignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreate {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mehta");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rao");
		 driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9999767676");
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("passs@123");
		 
		 WebElement dayEle = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 Select day = new Select(dayEle);
		 day.selectByVisibleText("29");
		 
		 WebElement monthEle = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select month = new Select(monthEle);
		 month.selectByVisibleText("Dec");
		 
		 WebElement yearEle = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select year = new Select(yearEle);
		 year.selectByVisibleText("2000");
		 
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 
		 
	 
			}

}
