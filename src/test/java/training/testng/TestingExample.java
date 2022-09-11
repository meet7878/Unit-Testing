package training.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingExample {

	@Test(timeOut =  2000)
	public void timeoutExample() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(true);
	}
}
