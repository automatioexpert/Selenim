package Nov9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	@Test
	public static void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.uniprot.org/uniprotkb/Q9UH92/entry");
		try {
		if(driver.findElement(By.cssSelector("button.button.secondary")).isDisplayed()) {
			driver.findElement(By.cssSelector("button.button.secondary")).click();
		}
		}
		catch (Exception e) {
		}
		System.out.println(driver.findElement(By.cssSelector("div.header__navigation")).getText());
	driver.findElement(By.cssSelector("input[aria-label='Text query in uniprotkb']")).sendKeys("services");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	System.out.println("I am the best expert on the Planet..Thank God!!");
	driver.quit();
	}

}
