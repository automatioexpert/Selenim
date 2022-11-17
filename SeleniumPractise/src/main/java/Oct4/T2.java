package Oct4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class T2 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mlrit.ac.in/");
		System.out.println(driver.findElement(By.cssSelector("img[alt='MLRIT']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("div.hd-call")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("div.hd-call")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.hd-btn.btn.btn-one>a")).getText());
		driver.findElement(By.cssSelector("a[href*='mlrit-login']")).click();
		System.out.println("I am the best Expert on the Planet..Thank God!!");
		
		driver.quit();
	}

}
