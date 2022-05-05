package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatecss {

	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
