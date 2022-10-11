package amazontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testecomm {
	@SuppressWarnings("deprecation")
	@Test
	public void f() {

		// chrome Initialization
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Redirect to amazon web page
		driver.get("https://www.amazon.in/");

		// sign in
		driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("9443433738");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Aishu@Amazon48");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		// add to cart
		driver.findElement(By.xpath("//img[@alt='Redmi A1 | starting from 5319']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	}

}
