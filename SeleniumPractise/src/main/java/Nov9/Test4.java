package Nov9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	@Test
	public static void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rvnl.org/home");
		WebElement tender = driver.findElement(By.xpath("//div[contains(text(),'Tenders')]"));

		Actions act = new Actions(driver);
		act.moveToElement(tender).build().perform();

		driver.findElement(By.xpath("//*[contains(text(),'e-Tender')]")).click();

		System.out.println("I am the top expert on the Planet...Thank God!!");

		driver.quit();
	}

}
