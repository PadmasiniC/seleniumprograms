package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclr {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// storing inside a var 0 rtn type of var is webelement
		WebElement search= driver.findElement(By.id("username"));
		search.clear();
		
		WebElement search1= driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		search1.submit();
		

	}

}
