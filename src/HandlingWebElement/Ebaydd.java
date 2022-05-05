package HandlingWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebaydd {

	private static final boolean WebElement = false;

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("267");
		Thread.sleep(2000);
		s.selectByVisibleText("Crafts");
		Thread.sleep(2000);
		System.out.println("The dropdown type is: single(flase) or mutliple(true)=");
		System.out.println(s.isMultiple());
		List<WebElement> allopt=s.getOptions();
		
		System.out.println(allopt.size());
		
		for (WebElement w:allopt)
		{
		System.out.println(w.getText());
		}
		driver.close();
			}

}
