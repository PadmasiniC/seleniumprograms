package HandlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
		 WebElement dd=driver.findElement(By.id("cars"));
		 Select s=new Select(dd);
		 s.selectByIndex(1);
		 Thread.sleep(3000);
		 s.selectByValue("299");
		 Thread.sleep(3000);
		 s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		 
		 Thread.sleep(3000);
		 
		 System.out.println(s.isMultiple());
		 if(s.isMultiple())
		 {
			 s.deselectAll();
		 }
		 driver.close();
	}

}
