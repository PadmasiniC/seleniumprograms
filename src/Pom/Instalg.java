package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instalg {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Instalogin i=new Instalogin(driver);
		i.usernametb("padhu");
		i.passwordtb("amma@28");
		 i.loginbtn();
	}

}

