package week2.assignments;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class FourAssignments_Duplicate_Lead {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	String expLeadname = null;
	String ActLeadname = null;
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
driver.findElement(By.xpath("//span[text()='Email']")).click();

driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");

driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(3000);
expLeadname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).getText();

driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

System.out.println("Dupicated Lead name is " +expLeadname);
String title = driver.getTitle();
System.out.println("Page title on Duplicate lead is: " +title);
Assert.assertTrue(title.contains("Duplicate Lead"));

driver.findElement(By.xpath("//input[@name='submitButton']")).click();

ActLeadname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
System.out.println(ActLeadname);
Assert.assertEquals(ActLeadname, expLeadname);
//Assert.assertTrue(ActLeadname.contains(expLeadname));



//driver.close();



	}

}
