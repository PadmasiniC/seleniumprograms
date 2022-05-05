package Scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2scroll {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele = driver.findElement(By.xpath("(//img[@class='landscape-image'])[3]"));
		 Point loc = ele.getLocation();
		int x= loc.getX();
		int y= loc.getY();
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 // Concatenation of x and y means x+y
		 	js.executeScript("window.scrollBy("+x+","+y+")");
		 	
		 	Thread.sleep(4000);
		 	ele.click();
		 	//driver.close();
	}
}
