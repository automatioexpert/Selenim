package Nov8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeetCode5 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leetcode.com/accounts/login/");
		System.out.println(driver.findElement(By.cssSelector("div.feedback-tab")).getText());
		List<WebElement> ele=driver.findElements(By.xpath("//div[starts-with(@class,'nav-item-container')]"));
		
		for(WebElement e:ele) {
			System.out.println(e.getText());
		}
		
		System.out.println("Thank You God!!");
		
		driver.quit();
	}

}
