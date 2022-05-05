package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4back {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("9807659082");
		driver.findElement(By.id("close-pop")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("iphone");
		Thread.sleep(4000);
		driver.close();
	}

}
