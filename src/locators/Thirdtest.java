package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirdtest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		driver.findElement(By.id("username")).sendKeys("7259955535");
		driver.findElement(By.id("password")).sendKeys("Padma@81");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (title.equals("Stay updated on your professional world"))
		{
			System.out.println("pass - homepage displayed");
			}
		else
		{
			System.out.println("failed");
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}
