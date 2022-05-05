package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1tng {

	@Test
	public void tc1()
	{
		Reporter.log("Hello maam",true); // prints in both console and report
		Reporter.log("Hello Selenium", false); // prints only in report
	}
}
