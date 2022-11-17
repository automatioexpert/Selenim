package Nov9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	@Test
	public static void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rvnl.org/home");
		driver.findElement(By.cssSelector("a[href*='contact']")).click();
		System.out.println(driver.findElement(By.xpath("//h4")).getText());
		System.out.println(driver.findElement(By.cssSelector("td>div>span")).getText());
		
		System.out.println("I am the best expert on the Planet...Thank You God for evrything!!!");
		
		driver.close();

	}

}
