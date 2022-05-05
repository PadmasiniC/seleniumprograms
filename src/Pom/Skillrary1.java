package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Skillrary s=new Skillrary(driver);
		s.loginbtn();
		s.emailaddtb("user");
		s.passwordtb("user");
		Thread.sleep(2000);
		s.submitbutton();
	}
}
