package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dcskillrary {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele=driver.findElement(By.xpath("//a[text()='COURSE']"));
		 
		 Actions mh=new Actions(driver);
		 mh.moveToElement(ele).perform();
		 driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		 WebElement plusbtn=driver.findElement(By.id("add"));
		 Thread.sleep(2000);
		Actions dc=new Actions(driver);
		dc.doubleClick(plusbtn).perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
