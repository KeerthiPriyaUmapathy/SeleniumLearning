package week2.assignments;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FourAssignments_EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	String comp = null;
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
driver.findElement(By.xpath("//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']//input[@name='firstName']")).sendKeys("hari");
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
System.out.println("Page title is: " +driver.getTitle());
driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();
String newComp = "XXXX";
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newComp);
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
comp = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
System.out.println(comp);
//Assert.assertEquals(comp, newComp);
Assert.assertTrue(comp.contains(newComp));

//driver.close();






	}

}
