package Nov12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	@Test
	public static void main() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://acumenacademy.org/courseCatalog/");
		driver.findElement(By.cssSelector("a[href*='blog']")).click();
		List<WebElement> items = driver.findElements(By.cssSelector("div.hero-nav-container>a"));
		for (WebElement item : items) {
			System.out.println(item.getText());
		}
		
	System.out.println("I am the top expert on the Planet...Thank You God!!");
	driver.quit();
	}

}
