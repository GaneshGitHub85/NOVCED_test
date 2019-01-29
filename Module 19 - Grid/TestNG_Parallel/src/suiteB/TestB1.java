package suiteB;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestB1 extends BaseTest{

	@Test
	public void testB1() throws InterruptedException {
		System.out.println("Starting B1");
		openBrowser("Chrome");
		Thread.sleep(5000);
		System.out.println("Ending B1");
	}
}
