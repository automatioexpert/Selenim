package Nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.msrit.edu/");
		System.out.println(driver.findElement(By.cssSelector("div#logo-image")).isDisplayed());

		List<WebElement> elements = driver.findElements(By.cssSelector("a.xatext"));

		for (WebElement el : elements) {
			System.out.println(el.getText());
		}

		WebElement ele = driver.findElement(By.cssSelector("a[href*='about-us']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Evolution')]")).click();

		System.out.println(driver.findElement(By.xpath("(//h2)[1]")).getText());
		System.out.println("I am the best expert on the Planet!!");
		driver.quit();

	}

}
