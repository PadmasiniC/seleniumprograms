package HandlingWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosug2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e1=driver.findElement(By.name("keyword"));
		e1.sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> ele=driver.findElements(By.xpath("//span[@class='search-text']"));
		System.out.println(ele.size());
		for (WebElement a:ele)
		{
			System.out.println(a.getText());
		}
		Thread.sleep(3000);
		driver.close();
	}

}
