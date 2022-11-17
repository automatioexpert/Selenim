package Nov11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mqpltd.com/contact/");
		driver.findElement(By.xpath("//span[contains(text(),'SECTORS')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div.fusion-text.fusion-text-1>h2")).getText());
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Packaging')]")).getText());
		driver.quit();
	}

}
