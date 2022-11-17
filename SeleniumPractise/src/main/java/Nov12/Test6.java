package Nov12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	@Test
	public static void main() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blog.acumenacademy.org/");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div.header")).getText());
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("user493497475@hp.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("suduw7343466564656656");
		driver.findElement(By.cssSelector("button.primaryBtn")).click();
		System.out.println("I am the best expert on the Planet..Thank God!!");
		Thread.sleep(5000);
		driver.quit();
	}

}
