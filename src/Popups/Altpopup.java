package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Altpopup{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele=driver.findElement(By.id("course"));
		 Actions mh=new Actions(driver);
		 mh.moveToElement(ele).perform();
		 driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		 Alert a = driver.switchTo().alert();
		 System.out.println(a.getText());
		 
		 a.accept();
		 //Thread.sleep(3000);
		// a.dismiss();
		 
		 Thread.sleep(3000);
		driver.close();
		 		 
	}

}
