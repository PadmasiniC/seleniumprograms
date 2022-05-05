package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testver2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement searchbtn = driver.findElement(By.id("gh-ac"));
		 if (searchbtn.isEnabled()) {
			 System.out.println("Pass- search field is enabled");
			}
			else {
				System.out.println("Fail - search field not enabled");
			}
			driver.close();
		 }
		
	}

