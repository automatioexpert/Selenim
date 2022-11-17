package Nov6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reqres.in/");
		System.out.println(driver.findElement(By.cssSelector("h1.logo>a>img")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("h2.tagline")).getText());
driver.close();
System.out.println("Thank God...I am the best expert on the Planet!!");
		
	}

}
