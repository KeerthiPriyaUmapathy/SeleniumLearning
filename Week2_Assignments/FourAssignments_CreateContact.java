package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FourAssignments_CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.xpath("//a[text()='Contacts']")).click();
driver.findElement(By.xpath("//a[text()='Create Contact']")).click();

driver.findElement(By.id("firstNameField")).sendKeys("Keerthi Priya");
driver.findElement(By.id("lastNameField")).sendKeys("U");
driver.findElement(By.name("firstNameLocal")).sendKeys("K");
driver.findElement(By.name("lastNameLocal")).sendKeys("P");
driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
driver.findElement(By.id("createContactForm_description")).sendKeys("This is for testing");
driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("123@gmail.com");
WebElement stateEle = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
Select state = new Select(stateEle);
state.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();
driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.id("updateContactForm_description")).clear();
driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("imp notes");
driver.findElement(By.xpath("//input[@value='Update']")).click();
System.out.println("Page title is: " +driver.getTitle());







	}

}
