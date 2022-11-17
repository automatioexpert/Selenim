package Nov12;

import org.openqa.selenium.By;
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
		driver.get("https://acumenacademy.org/");
		boolean status=driver.findElement(By.xpath("(//p)[1]")).isDisplayed();
		System.out.println(status);
		if(driver.findElement(By.cssSelector("g#Desktop")).isDisplayed()) {
			driver.findElement(By.cssSelector("g#Desktop")).click();
		}
		driver.findElement(By.cssSelector("div.primary-bg.css-vjrclz.e3iwtak6")).click();
		System.out.println("Test Passed");
	}

}
