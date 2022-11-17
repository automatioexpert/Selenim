package Nov9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public static void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nike.com/in/a/six-habits-of-the-athlete-mindset");
		System.out.println(driver.findElement(By.cssSelector("a[aria-label='Nike Homepage']")).isDisplayed());
		driver.findElement(By.cssSelector("input#VisualSearchInput")).click();
		driver.findElement(By.cssSelector("input#VisualSearchInput")).sendKeys("Air Force 1" + Keys.ENTER);
		System.out.println(driver.findElement(By.cssSelector("span.title_prefix")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.wall-header__content")).getText());

	}

}
