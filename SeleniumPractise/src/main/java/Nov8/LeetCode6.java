package Nov8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeetCode6 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leetcode.com/accounts/login/");
		driver.findElement(By.cssSelector("a[href$='/discuss/']")).click();

		driver.findElement(By.xpath("//h1[contains(text(),'Compensation')]")).click();
		
		List<WebElement> ele=driver.findElements(By.cssSelector("button.css-wudosy"));
		
		for(WebElement el:ele) {
			el.click();
		
		}
		
		System.out.println("I am the top expert on the Planet");
		
		driver.quit();
	}

}
