package suiteA;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestA2 extends BaseTest{

	@Test(priority=1)
	public void testA2() throws InterruptedException {
		System.out.println("Starting A2");
		openBrowser("Chrome");
		Thread.sleep(5000);
		System.out.println("Ending A2");
	}
	
	@Test(priority=2)
	public void testAA2() {
		driver.get("http://yahoo.com");
	}
}
