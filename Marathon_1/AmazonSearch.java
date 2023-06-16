package marathon1;

import java.time.Duration;

//Testcase:2(Amazon)
//===============
//01) Launch Chrome  
//02) Load https://www.amazon.in/
//     add  implicitlyWait
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//03) Type "Bags" in the Search box
//04) Choose the 	 item in the result (bags for boys)
//05) Print the total number of results (like 50000)
//    1-48 of over 50,000 results for "bags for boys"
//06) Select the first 2 brands in the left menu
//    (like American Tourister, Generic)
//07) Choose New Arrivals (Sort)
//08) Print the first resulting bag info (name, discounted price)
//09) Get the page title and close the browser(driver.close())	

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		String Label = null;
		Label = driver.findElement(By.xpath("//div[@class='sg-col-inner']/div/span")).getText();

		String Label1 = null;
		Label1 = driver.findElement(By.xpath("//div[@class='sg-col-inner']/div/span[3]")).getText();
		System.out.println(Label + " " + Label1);
		Thread.sleep(2000);

		WebElement element1 = driver
				.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-size-base a-color-base'])[1]"));

		element1.click();
		WebElement element2 = driver
				.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-size-base a-color-base'])[2]"));

		element2.click();

		WebElement sortEle = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select sort = new Select(sortEle);
		sort.selectByVisibleText("Newest Arrivals");

		String name = null;
		String dprice = null;
		name = driver.findElement(By.xpath(
				"(//div[@class='a-section a-spacing-base a-text-center'][1]//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"))
				.getText();

		dprice = driver
				.findElement(By.xpath(
						"(//div[@class='a-section a-spacing-base a-text-center'][1]//span[@class='a-price-whole'])[1]"))
				.getText();
		System.out.println(name);
		System.out.println(dprice);
		System.out.println("Page title is: " + driver.getTitle());

//driver.close();
	}

}
