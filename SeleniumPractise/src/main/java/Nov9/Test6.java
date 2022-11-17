package Nov9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	@Test
	public static void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rvnl.org/employee-login/6/Employee");
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Last updated')]")).getText());
		
		System.out.println("I am the best expert on the Planet");
		driver.quit();
	}

}
