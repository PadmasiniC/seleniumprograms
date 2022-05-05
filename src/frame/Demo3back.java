package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo3back {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/search?q=core+java+for+selenium+training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
		driver.findElement(By.xpath("//a[text()=' Core Java For Selenium Trainin']")).click();
		driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='play rounded-box state-paused']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.name("q")).sendKeys("python");
		Thread.sleep(3000);
		driver.close();
	}
}
