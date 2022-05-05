package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifthtest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/login/password?referer=https%3A%2F%2Fwww.myntra.com%2F&show=false");
		
		driver.findElement(By.id("mobileNumberPass")).sendKeys("9590663831");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Harshu@05");
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		
		String title=driver.getTitle();
		System.out.println("title: "+title);
		String url=driver.getCurrentUrl();
		System.out.println("url="+url);
		//verification
		if (title.equals("Myntra"))
		{
			System.out.println("testing pass- homepage  displayed");
		}
		else
		{
			System.out.println("fail- homepage not displayed");
		}
		Thread.sleep(4000);
		driver.close();
		}

}
