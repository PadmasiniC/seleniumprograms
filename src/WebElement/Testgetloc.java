package WebElement;


import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testgetloc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement un=driver.findElement(By.id("email"));
		Point loc = un.getLocation();
		System.out.println(loc.getX()+ "X-axis");
		
		System.out.println(loc.getY()+ "Y-axis");
		
		driver.close();
		
	}

}
