package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2loc {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.id("tel")).sendKeys("Harshu");
		driver.findElement(By.id("password")).sendKeys("Abc@12");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		}

}
