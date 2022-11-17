package Oct4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T3 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://103.15.62.229/Results/mlrit-login/");
		List<WebElement> groups=driver.findElements(By.cssSelector(".input-group"));
		for(WebElement grp:groups) {
			System.out.println(grp.getAttribute("placeholder"));
		}
		
		System.out.println("God is with me..Thank You!!");
		driver.quit();
	}

}
