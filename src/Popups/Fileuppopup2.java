package Popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuppopup2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/?r=us");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("(//a[text()='Sign in'])[2]")).click();
		//driver.findElement(By.name("__email")).sendKeys("cgshini@gmail.com");
		driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
		driver.findElement(By.name("__email")).sendKeys("cgshini@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload your resume']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Padmasini\\Desktop\\padmasini c cv.docx");
	}
}
