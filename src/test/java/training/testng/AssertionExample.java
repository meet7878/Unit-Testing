package training.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	@Test
	
	public void testone() {
		boolean isLoggedIn = true;
		String logInText = "Log off";
		Assert.assertTrue(isLoggedIn,"Login fail");
		Assert.assertEquals("sign off",logInText );
		
	}
}
