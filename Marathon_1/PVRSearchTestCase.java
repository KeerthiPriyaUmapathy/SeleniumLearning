package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PVRSearchTestCase {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		Thread.sleep(2000);
		WebElement cityEle = driver.findElement(By.xpath("//select[@name='city']"));
		Select city = new Select(cityEle);
		city.selectByVisibleText("Chennai");

		WebElement genreEle = driver.findElement(By.xpath("//select[@name='genre']"));
		Select genre = new Select(genreEle);
		genre.selectByVisibleText("ANIMATION");

		WebElement langEle = driver.findElement(By.xpath("//select[@name='lang']"));
		Select lang = new Select(langEle);
		lang.selectByVisibleText("ENGLISH");

		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='movie-list']/div[1]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(2000);
		WebElement cinemaEle = driver.findElement(By.xpath("//select[@name='cinemaName']"));
		Select cinema = new Select(cinemaEle);
		cinema.selectByIndex(3);

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Keerthi");
		driver.findElement(By.xpath("//div[@class='pvr-datepicker']//input")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted'][5]")).click();

		WebElement timingsEle = driver.findElement(By.xpath("//select[@name='timings']"));
		Select timings = new Select(timingsEle);
		timings.selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");

		WebElement foodEle = driver.findElement(By.xpath("//select[@name='food']"));
		Select food = new Select(foodEle);
		food.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Mobile']/preceding-sibling::input")).sendKeys("9620966645");
		driver.findElement(By.xpath("//label[text()='Other Requirements']/preceding-sibling::input")).sendKeys("test");
		Thread.sleep(3000);
		WebElement checkboxEle =driver.findElement(By.xpath("(//label[@class='custom-control custom-radio']/span)[1]"));
		
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(30));
		checkboxEle = wait2.until(ExpectedConditions.visibilityOf(checkboxEle));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkboxEle);
		//checkboxEle.click();
	
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//div[@class='otp-input-box']//button[text()='CANCEL'])[2]")).click();
		
WebElement element1 = driver.findElement(By.xpath("(//div[@class='otp-input-box']//button[text()='CANCEL'])[2]"));

WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
//		element1 = wait.until(ExpectedConditions.visibilityOf(element1));

 element1.click();
		System.out.println("Page title is: " + driver.getTitle());

	}

}
