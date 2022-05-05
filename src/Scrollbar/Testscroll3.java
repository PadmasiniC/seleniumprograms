package Scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscroll3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele = driver.findElement(By.xpath("//div[@class='myx-base']"));
		Point po = ele.getLocation();
		
		int a=po.getX();
		int b=po.getY();
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 	js.executeScript("window.scrollBy("+a+","+b+")");
		 	
		 	Thread.sleep(3000);
		 	ele.click();
		 	Thread.sleep(3000);
		 	//driver.close();

	}

}
