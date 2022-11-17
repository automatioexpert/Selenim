package Nov8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeetCode2 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leetcode.com/");
		System.out.println(driver.findElement(By.cssSelector("h1+p")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.icon-set+h2")).getText());
		driver.findElement(By.xpath("//span[contains(text(),'Explore')]")).click();
	
		System.out.println("I am the top Expert on the Planet");
		driver.quit();
		
	}

}
