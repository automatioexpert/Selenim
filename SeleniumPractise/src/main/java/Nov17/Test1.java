package Nov17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.businessinsider.com");
		System.out.println(driver.findElement(By.cssSelector("div.bi-hamburger-icon")).isDisplayed());
		driver.findElement(By.cssSelector("a[title='Business']")).click();
		List<WebElement> element = driver.findElements(By.xpath("h2"));
		for (WebElement ele : element) {
			System.out.println(ele.getText());
		}
		driver.quit();
	}

}
