package Nov8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeetCode7 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leetcode.com/accounts/login/");
		driver.findElement(By.xpath("//span[contains(text(),'Premium')]")).click();
		System.out.println(driver.findElement(By.cssSelector("img+h1")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.row.hero-quote")).getText());
		driver.findElement(By.xpath("//a[contains(text(),'Apple')]")).click();

		List<WebElement> ele = driver.findElements(By.cssSelector("div.text"));
		for (WebElement el : ele) {
			System.out.println(el.getText());
		}
		
		driver.quit();

	}

}
