package Nov12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	@Test
	public static void main() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://acumenacademy.org/courseCatalog/");
		WebElement foundry=driver.findElement(By.cssSelector("a[href*='foundry']"));
		Actions act = new Actions(driver);
		act.moveToElement(foundry).build().perform();
		driver.findElement(By.cssSelector("a[href*='acce']")).click();
		
		List<WebElement> elements=driver.findElements(By.cssSelector("div h2"));
		
		for(WebElement element:elements) {
			System.out.println(element.getText());
		}
		System.out.println("I am the Top Expert on the Planet..Thank God!!");
		driver.quit();
	}

}
