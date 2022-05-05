package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instalogin {
	//declaration
	@FindBy(name="username")
	private WebElement usernametb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	//INITIALIZATION
	public Instalogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void usernametb(String username)
	{usernametb.sendKeys(username);
		
	}
	
	public void passwordtb (String password)
	{
		passwordtb.sendKeys(password);
	}
	
	public void loginbtn()
	{
		loginbtn.click();
	}
	
	
}
