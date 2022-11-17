package Nov17;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.businessinsider.in/business");
		driver.findElement(By.cssSelector("div.account-dropdown")).click();
		System.out.println(driver.findElement(By.cssSelector("a.logobrand")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("div.subtitle-text>p")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sign in with')]")).getText());
		System.out.println("Test Passed..Thank God..I am the best expert on the Planet");
		driver.quit();
		
		
	}

}
