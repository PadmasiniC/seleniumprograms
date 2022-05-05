package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlocate {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("padhu");
		driver.findElement(By.name ("pass")).sendKeys("amma28");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		//verification
		if (title.equals(title))
		{ 
			System.out.println("Pass ");
		}
		else {
			System.out.println("Fail ");
		}
	}
}
