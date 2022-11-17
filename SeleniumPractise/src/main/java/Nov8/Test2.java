package Nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cars.mclaren.com/en");

		try {
			if (driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).isDisplayed()) {
				driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
			}
		} catch (Exception e) {
		}

		driver.findElement(By.xpath("//span[contains(text(),'FIND A RETAILER')]")).click();
		System.out.println(driver.findElement(By.cssSelector("h1.heading-01")).getText());
		System.out.println(driver.findElement(By.cssSelector("p.title")).getText());
		List<WebElement> lists=driver.findElements(By.cssSelector(".link-list>a"));
		
		for(WebElement li:lists) {
			System.out.println(li.getText());
		}

	System.out.println("I am the best expert on the Planet!!");
	driver.quit();
	}

}
