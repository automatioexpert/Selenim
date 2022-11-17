package Nov8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeetCode11 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leetcode.com/bugbounty/");
		driver.findElement(By.cssSelector("a.ant-dropdown-link.ant-dropdown-trigger")).click();
		System.out.println(driver.findElement(By.cssSelector("h3#eligibility+br+p")).getText());
		List<WebElement> ele = driver.findElements(By.cssSelector("p+ul>li"));
		System.out.println("Total elements are: "+ele.size());
		for (WebElement el : ele) {
			System.out.println(el.getText());
		}

		driver.quit();
	}

}
