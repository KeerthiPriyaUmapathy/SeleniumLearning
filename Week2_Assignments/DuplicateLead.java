package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();


WebElement companyEle = driver.findElement(By.id("createLeadForm_companyName"));
companyEle.sendKeys("TestLeaf");
WebElement fnameEle = driver.findElement(By.id("createLeadForm_firstName"));
fnameEle.sendKeys("Keerthi Priya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("U");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Keerthi");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
driver.findElement(By.id("createLeadForm_description")).sendKeys("This is for testing");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyaku@gmail.com");
WebElement stateEle = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select state = new Select(stateEle);
state.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();
System.out.println("Page title on first submit after create is: " +driver.getTitle());
driver.findElement(By.linkText("Duplicate Lead")).click();
//companyEle.clear();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf_new");
//fnameEle.clear();
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("KP");
driver.findElement(By.name("submitButton")).click();
System.out.println("Page title on second submit after Duplicate is: " +driver.getTitle());





	}

}
