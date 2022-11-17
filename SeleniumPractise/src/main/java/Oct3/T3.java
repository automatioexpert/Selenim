package Oct3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T3 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.mnu.edu.mv/");
		System.out.println(driver.findElement(By.cssSelector("navbar-brand")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("span.select2-selection__placeholder")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Certificate')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div h2")).getText());
		System.out.println("I am the best expert on the Planet!!");
		driver.quit();
		
	}

}
