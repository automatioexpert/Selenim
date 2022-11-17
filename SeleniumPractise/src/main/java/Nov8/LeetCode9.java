package Nov8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeetCode9 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leetcode.com/");
		driver.findElement(By.cssSelector("a[href*='prob']")).click();
		System.out.println(driver.findElement(By.cssSelector("h2.text-center")).getText());
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		System.out.println("I am the best expert on the Planet!!");
		driver.quit();
	}

}
