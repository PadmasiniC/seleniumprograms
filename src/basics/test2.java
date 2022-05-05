package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.flipkart.com/");
		driver.get("//www.reddit.com/login/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("sucessfully done");
		driver.close();
		
	}

}