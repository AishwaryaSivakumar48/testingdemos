package flipkartTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testing_flipkart {

	@Test
	public void testSearch() {

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver_win32\\chromedriver.exe");
		// launch driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		// click x
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		
		//click on mobile category
		driver.findElement(By.cssSelector("div[class='_331-kn _2tvxW'] div:nth-child(3) a:nth-child(1) div:nth-child(2)")).click();
		
		//click on search bar and send Iphone  13
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Iphone 13" + Keys.ENTER);
		 
		//checking for scroll feature
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,2500)");
		
		
	}

}
