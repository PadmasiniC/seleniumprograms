package HandlingWebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownfb {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 
		 WebElement dd=driver.findElement(By.id("month"));
		 Select s=new Select(dd);
		 s.selectByIndex(1);
		 Thread.sleep(2000);
		 s.selectByValue("8");
		 Thread.sleep(2000);
		 s.selectByVisibleText("Oct");
		 Thread.sleep(2000);
		 System.out.println(s.isMultiple());
	
		 List<WebElement> alloptions=s.getOptions();
		List<String> original =new ArrayList<String>();	
		 System.out.println(alloptions.size());
		 System.out.println("Before Sorting:");
			for(WebElement b:alloptions)
			{
				
				System.out.println(b.getText());
				 original.add(b.getText());
			}
			Collections.sort(original);
			System.out.println("After sorting alphabatically:");
			System.out.println( original);
					
			 		driver.close();		 
	}
}
