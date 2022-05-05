package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rcamazon {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		 Actions a=new Actions(driver);
		 a.contextClick(ele).perform();
		 Thread.sleep(2000);
		 driver.close();
	}

}
