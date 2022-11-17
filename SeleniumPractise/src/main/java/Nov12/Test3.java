package Nov12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	@Test
	public static void main() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://acumenacademy.org/register/");
		driver.findElement(By.xpath("//a[normalize-space()=\"Courses\"]")).click();
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Explore Our Courses')]")).getText());
		System.out.println("I am the best expert on the Planet..Thank God!!");
		driver.quit();
		
	}

}
