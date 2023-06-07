package week2.assignments;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class FourAssignments_Delete_Lead {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	String expNodata = "No records to display";
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
driver.findElement(By.xpath("//span[text()='Phone']")).click();

//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("310");
driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");

driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();

driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
driver.findElement(By.xpath("//a[text()='Delete']")).click();
System.out.println("Deleted Lead id is " +leadID);
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
String noData = null;
noData =driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
System.out.println(noData);
Assert.assertEquals(noData, expNodata);


//driver.close();



	}

}
