package HandlingWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://www.google.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement el =driver.findElement(By.name("q"));
		 el.sendKeys("seleni");
		Thread.sleep(3000);
		List<WebElement> ele=driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(ele.size());
		
		for (WebElement b:ele)
		{
			System.out.println(b.getText());
		}
	
	driver.close();
	}

}
