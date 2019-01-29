package suiteB;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestB3 extends BaseTest{

	
	@Test
	public void testB3() throws InterruptedException {
		System.out.println("Starting B3");
		openBrowser("IE");
		Thread.sleep(5000);
		System.out.println("Ending B3");
	}
}
