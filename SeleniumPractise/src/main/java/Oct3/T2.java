package Oct3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T2 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sugermint.com/famous-entrepreneurs-in-the-world/");
		WebElement submit = driver.findElement(By.xpath("//a[contains(text(),'Submit')]"));

		Actions act = new Actions(driver);
		act.moveToElement(submit).build().perform();
		
		driver.findElement(By.cssSelector("ul.sub-menu>li>a[href*='story']")).click();
		System.out.println(driver.findElement(By.cssSelector("h1.g1-alpha.g1-alpha-2nd.page-title")).getText());
		driver.quit();
		System.out.println("I am the best expert on the Planet!!Thank God!!");
		driver.close();
	}

}
