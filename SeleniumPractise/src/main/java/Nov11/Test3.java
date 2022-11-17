package Nov11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mqpltd.com/about/");
		driver.findElement(By.cssSelector("a[href*=contact]")).click();
		System.out.println(driver.findElement(By.xpath("//h2")).getText());
		driver.findElement(By.cssSelector("input#nf-field-1")).sendKeys("user38455974");
		driver.findElement(By.cssSelector("input#nf-field-2")).sendKeys("usd38445945745@gmai.com");
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("934737493477");
		driver.findElement(By.cssSelector("input[name='nf-field-6']")).sendKeys("ABC INC LTD");
		driver.findElement(By.cssSelector("textarea#nf-field-3")).sendKeys(
				"Please fill in the form below for more details on our product ranges and to discuss how we can help you with improving your casthouse operations.");
	
		try {
			driver.findElement(By.cssSelector("input[value='Submit']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am the best expert on the Planet.thanks!!");
	
	}

}
