package Nov8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeetCode4 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leetcode.com/");
		System.out.println(driver.findElement(By.cssSelector("h1")).getText());
		driver.findElement(By.cssSelector("a[href*='login']")).click();
		System.out.println(driver.findElement(By.cssSelector("img[alt='LeetCode']")).isDisplayed());
		driver.findElement(By.cssSelector("input[name='login']")).sendKeys("user34838403@gmail.com");
		driver.findElement(By.cssSelector("input#id_password")).sendKeys("P48384903734000000000000008946545646");
		System.out.println(driver.findElement(By.cssSelector("input#id_password")).getAttribute("value"));
		System.out.println(driver.findElement(By.cssSelector("div.recaptcha-container__2wXL")).getText());
		
		List<WebElement> elements=driver.findElements(By.cssSelector("ul.nav-items__1KWV>li"));
		for(WebElement  e:elements) {
			System.out.println(e.getText());
		}
		
		driver.quit();
		
	}

}
