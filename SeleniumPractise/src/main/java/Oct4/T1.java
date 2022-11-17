package Oct4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eaton.com/us/en-us/products/process-safety-automation-measurement.html/");
		driver.findElement(By.cssSelector("span.header-utility-nav__signin")).click();
		System.out.println(driver.findElement(By.cssSelector("img.rendition__image.img-responsive")).isDisplayed());

		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("user3403483483");
		String a = driver.findElement(By.cssSelector("label[for='input5']")).getAttribute("value");
		System.out.println(a);

		List<WebElement> elements = driver.findElements(By.cssSelector("div p b"));

		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}

		System.out.println("I am the best Expert on the Planet!!");
		driver.quit();

	}

}
