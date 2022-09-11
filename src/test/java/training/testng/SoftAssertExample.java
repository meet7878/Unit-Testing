package training.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	private SoftAssert sf; 
	
	@BeforeMethod
	public void setup() {
		sf = new SoftAssert();
		
	}
	
	@Test
	public void softAssert() {
		
		
		String fname="meet",lname="modi",address="prantij";
		int phone=7878;
		/*
		 * Assert.assertEquals("hp",fname);
		 *  Assert.assertEquals("modi", lname);
		 * Assert.assertEquals("prantij", address);
		 *  Assert.assertEquals("9898", phone);
		 */
		   sf.assertEquals("hp",fname);
		   sf.assertEquals("modi", lname);
		  sf.assertEquals("prantij", address);
		   sf.assertEquals("9898", phone);
		   sf.assertAll();
	}
	
	@Test
	public void softAssert2() {
		sf = new SoftAssert();
		sf.assertTrue(true);
		sf.assertAll();
		
	}

}
