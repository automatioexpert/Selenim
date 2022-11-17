package Nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cars.mclaren.com/en");
		System.out.println(driver.findElement(By.cssSelector("div.content-wrapper>p")).getText());
	
		List<WebElement> summary=driver.findElements(By.cssSelector("div.copy-summary"));
		
		for(WebElement sum:summary) {
			System.out.println(sum.getText());
		}
		
		System.out.println("I am the best expert on the Planet");
		driver.quit();

		
	}

}
