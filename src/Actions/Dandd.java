package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dandd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement block4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		 WebElement block3=driver.findElement(By.xpath("//h1[text()='Block 3']"));
		 
		 Thread.sleep(3000);
		 
		 Actions a=new Actions(driver);
		 a.dragAndDrop(block4, block3).perform();
		 Thread.sleep(3000);
				 
		 WebDriver driver1=new FirefoxDriver();
		 driver1.manage().window().maximize();
			driver1.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement blk1=driver1.findElement(By.xpath("//h1[text()='Block 1']"));
			 WebElement blk2=driver1.findElement(By.xpath("//h1[text()='Block 2']"));
			 
			 Actions b=new Actions(driver1);
			 b.dragAndDrop(blk2, blk1).perform();
			 Thread.sleep(3000);
			 driver1.close();

	}

}