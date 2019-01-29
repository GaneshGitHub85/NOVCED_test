package suiteB;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestB2 extends BaseTest{

	@Test
	public void testB2() throws InterruptedException {
		System.out.println("Starting B2");
		openBrowser("Mozilla");
		Thread.sleep(5000);
		System.out.println("Ending B2");
	}
}
