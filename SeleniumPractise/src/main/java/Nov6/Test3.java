package Nov6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mlogica.com/");
		
		
		if (driver.findElement(By.cssSelector("button#psGotItBtn")).isDisplayed()) {
			driver.findElement(By.cssSelector("button#psGotItBtn")).click();
		}
		
		System.out.println(driver.findElement(By.cssSelector("img[alt='Logo']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("h6+h1")).getText());
		driver.findElement(By.cssSelector("div#show")).click();
		driver.findElement(By.name("s")).sendKeys("absc");
		driver.findElement(By.cssSelector("button.search-btn span.fa.fa-search")).click();
		System.out.println("I am the World top expert on the Planet!!");

		driver.quit();
	}

}
