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

public class Test2 {

	@Test
	public static void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rvnl.org/home");
		System.out.println(driver.findElement(By.cssSelector("img[alt='Rvnl Logo']")).isDisplayed());
		driver.findElement(By.cssSelector("a#top-search-trigger")).click();
		driver.findElement(By.cssSelector("input#gsc-i-id1")).sendKeys("India" + Keys.ENTER);
		System.out.println(driver.findElement(By.cssSelector("div.gsc-result-info")).isDisplayed());

		List<WebElement> elements = driver.findElements(By.cssSelector("div.gs-title>a"));
		for (WebElement el : elements) {
			System.out.println(el.getText());
		}
		
		System.out.println("I am the best expert on the Planet..Thank God!!");
		driver.quit();

	}

}
