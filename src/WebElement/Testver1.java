package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testver1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sb=driver.findElement(By.id("twotabsearchtextbox"));
		if(sb.isDisplayed()) {
			System.out.println("Pass- search field is displayed");
		}
		else {
			System.out.println("Fail - search field not displayed");
		}
		driver.close();
	}

}
