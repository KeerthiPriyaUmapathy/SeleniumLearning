package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class acmeLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 System.out.println("Page title is: " +driver.getTitle());
		 driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		 Thread.sleep(1000);
		 driver.close();
	}

}
