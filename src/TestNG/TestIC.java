package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestIC {
	@Test (priority=1)
	public void calls() {
		Reporter.log("Hello World", true);
	}

	@Test (priority=-1, invocationCount=5)
	public void chats() {
		Reporter.log("Hello Food", true);
	}
	@Test (enabled=false)
	public void set() {
	 Reporter.log("Hello Trial", true);
	}
}
