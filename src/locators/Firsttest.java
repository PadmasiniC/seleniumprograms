package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttest {


	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abcde");
		driver.findElement(By.id("pass" )).sendKeys("aaa@28");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook - log in or sign up"))
			{
				System.out.println("Pass -homapage dispayed");
			}
			else {			
					
			System.out.println("Failed - hoempage not displayed");
			}
		
		String site=driver.getCurrentUrl();
		System.out.println(site);
		Thread.sleep(3000);		
	driver.close();
	}
}