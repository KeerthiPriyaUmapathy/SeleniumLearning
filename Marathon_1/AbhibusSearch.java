package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbhibusSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
	
driver.findElement(By.xpath("//li[@class='nav-item pr-1 px-md-2']/a[text()='Bus']")).click();
driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
driver.findElement(By.xpath("//ul[@id='ui-id-1']/li")).click();
driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
driver.findElement(By.xpath("//ul[@id='ui-id-2']/li")).click();
driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
driver.findElement(By.xpath("//td[@data-month='5']/a[text()='15']")).click();
driver.findElement(By.xpath("//a[text()='Search']")).click();
String busName = null;
busName = driver.findElement(By.xpath("//div[@class='col2 column-middle']/div/h2[1]")).getText();
System.out.println(busName);
driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
String avaSeats = null;
avaSeats = driver.findElement(By.xpath("//div[@class='search-column2']/div/p")).getText();
System.out.println(avaSeats);
driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//ul/li/a[@class='tooltip tooltipstered']")).click();


String seatNum = null;

seatNum = driver.findElement(By.xpath("//div[@class='jurnydetails']//span[@id='seatnos']")).getText();
System.out.println(seatNum);
String ticFare = null;

ticFare = driver.findElement(By.xpath("//div[@class='jurnydetails']//span[@id='ticketfare']")).getText();
System.out.println(ticFare);
	}

}
