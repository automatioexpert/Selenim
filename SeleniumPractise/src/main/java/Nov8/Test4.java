package Nov8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cars.mclaren.com/en");
		driver.findElement(By.cssSelector("span.icon.hamburger-icon")).click();
		List<WebElement> elements = driver.findElements(By.cssSelector("div.category"));

		for (WebElement el : elements) {
			System.out.println(el.getText());
		}

		System.out.println("Thank You God!!");
		driver.close();
	}

}
