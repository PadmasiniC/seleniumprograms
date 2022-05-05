package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {
	
	// declaration

	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginbtn;
	
	@FindBy(id="email")
	private WebElement emailaddtb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement submitbutton;
	
	// initialization
	public Skillrary (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void loginbtn()
	{
		loginbtn.click();
	}
	
	public void emailaddtb(String username)
	{emailaddtb.sendKeys(username);
		
	}
	
	public void passwordtb (String password)
	{
		passwordtb.sendKeys(password);
	}
	
	public void submitbutton()
	{
		submitbutton.click();
	}
}

