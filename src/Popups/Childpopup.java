package Popups;

import java.time.Duration;
import java.util.Set;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.facebook.com");
		String parent=driver.getWindowHandle();
		System.out.println("parent window address: ");
		System.out.println(parent);
		
		Set<String>child=driver.getWindowHandles();
		System.out.println("parent&child window adresses:");
		System.out.println(child);
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.quit();
			}

}
