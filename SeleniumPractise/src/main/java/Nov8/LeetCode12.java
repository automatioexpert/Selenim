package Nov8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeetCode12 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leetcode.com/bugbounty/");
	
		driver.findElement(By.cssSelector("a[href*='explore']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector("div.title.explore-page-title")).getText());
		
		System.out.println("I am the best expert on the Planet..Thank God!!");
		driver.quit();
	}

}
