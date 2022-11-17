package Oct3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sugermint.com/famous-entrepreneurs-in-the-world/");
		System.out.println(driver.findElement(By.cssSelector("img[alt='Suger Mint']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		driver.quit();
		System.out.println("I am the best expert on the Planet");

	}

}
