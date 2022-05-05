package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourthtest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7259675535");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Padhu@81");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		String title=driver.getTitle();
		System.out.println("title="+title);
		String url=driver.getCurrentUrl();
		System.out.println("url="+url); 
		//verification
		if (title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("pass- display homepage");
		}
		else
		{
			System.out.println("fail- homepage not displayed");
		}
		Thread.sleep(4000);
		driver.close();
	}

}
