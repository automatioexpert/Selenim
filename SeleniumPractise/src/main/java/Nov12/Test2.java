package Nov12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	@Test
	public static void main() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://acumenacademy.org/fellowship/");
		//driver.findElement(By.xpath("//a[contains(text(),'Sign Me Up!')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div div h1")).isDisplayed());
		driver.findElement(By.cssSelector("input#footer-first_name")).sendKeys("Usernam34348384");
		driver.findElement(By.cssSelector("input#footer-last_name")).sendKeys("Usernam34348384");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Usernam34348384");
		System.out.println("Highlighted"+driver.findElement(By.cssSelector("div.has-errors")).isDisplayed());
		driver.findElement(By.cssSelector("input#footer-password")).sendKeys("Usernam34348384");
		
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Must have')]")).getText());
	
		driver.findElement(By.xpath("//input[@id=\"footer-confirm_password\"]")).sendKeys("Usernam34348384");
		Thread.sleep(4500);
		driver.findElement(By.cssSelector(".secondary")).click();
		
		
		driver.quit();
		System.out.println("I am the best expert on the Planet");
	}

}
