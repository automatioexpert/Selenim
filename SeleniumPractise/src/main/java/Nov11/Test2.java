package Nov11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	@Test
	public void test1() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mqpltd.com/about/");
		WebElement company = driver.findElement(By.xpath("//span[contains(text(),'COMPANY')]"));
		Actions act = new Actions(driver);

		act.moveToElement(company).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'TESTIMONIALS')]")).click();
		Thread.sleep(4000);
		List<WebElement> calc=driver.findElements(By.cssSelector("h1.fusion-responsive-typography-calculated"));
		for(WebElement cal:calc) {
			System.out.println(cal.getText());
		}
		Thread.sleep(1200);
		driver.quit();
		
	}

}
