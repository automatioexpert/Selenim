package Nov9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	@Test
	public static void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rvnl.org/home");
		WebElement loginBtn = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		Actions act = new Actions(driver);
		act.moveToElement(loginBtn).build().perform();

		driver.findElement(By.xpath("//a[contains(text(),'Employee')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id=\"tab1\"] h4")).getText());

		System.out.println("I am the Top Expert on the Planet...Thank You God!!");
		driver.quit();

	}

}
