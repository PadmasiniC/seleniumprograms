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

public class Fbsorting {

	public static void main(String[] args) throws InterruptedException {
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
		 
		 List<WebElement> options=s.getOptions();
		 System.out.println(options.size());
		 
		 ArrayList a=new ArrayList<>();
		 
		 for(WebElement allopt:options) {
			 String text=allopt.getText();
			 a.add(text);
			 System.out.println(text);
		 }
		 Collections.sort(a);
		 System.out.println("After sorting");
		 for (Object b:a) {
			 System.out.println(b);
			 }
		 driver.close();
	}

}
