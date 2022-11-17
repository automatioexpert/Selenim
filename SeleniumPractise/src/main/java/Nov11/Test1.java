package Nov11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mqpltd.com/");
		driver.findElement(By.cssSelector("(//a[@class='fusion-bottombar-highlight'])[2]")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class=\"fusion-text fusion-text-1\"] h2[class=\"fusion-responsive-typography-calculated\"]")).getText());
		System.out.println("I am the best expert on the Planet");
		driver.quit();
	}

}
