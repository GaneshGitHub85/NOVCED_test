package suiteA;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestA1 extends BaseTest{

	@Test
	public void testA1() throws InterruptedException {
		
		System.out.println("Starting A1");
		openBrowser("Mozilla");
		Thread.sleep(5000);
		System.out.println("Ending A1");
		
	}
}
