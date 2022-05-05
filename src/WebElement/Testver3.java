package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testver3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 WebElement searchbtn = driver.findElement(By.name("sex"));
				
		 if (searchbtn.isSelected()) {
			 System.out.println("Pass- Female radio button field is enabled");
			}
			else {
				System.out.println("Fail - Female radio button field not enabled");
			}
			driver.close();
		 }
	}
