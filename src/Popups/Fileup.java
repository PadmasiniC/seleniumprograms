package Popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileup {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//to integrate the autoitfile and upload the resume
		// compile-64bit
		Runtime.getRuntime().exec("C:\\Users\\Padmasini\\Desktop\\padmasini c cv.docx");
		//driver.close();
	}
}
