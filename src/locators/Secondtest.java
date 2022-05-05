package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondtest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reddit.com/login/");
		
		driver.findElement(By.id("loginUsername")).sendKeys("harshu");
		driver.findElement(By.id("loginPassword")).sendKeys("h123");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.equals("file://www.reddit.com/login/"))
		{
			System.out.println("sucessfully lanuched - homepage displayed");
		}
		else
		{
			System.out.println("failed to lanuch");
		}
		
		//driver.close();
	}

}
