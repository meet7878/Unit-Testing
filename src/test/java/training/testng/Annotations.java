package training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Annotations {
  @BeforeClass
  public void setup() {
	  System.out.println("before class");
  }
	
	@Test
  public void firstTest() {
	  System.out.println("This is first test method......");
  }
  
  @Test
  public void secondTest() {
	  System.out.println("This is second test method......");
  }
  
  @Test
  public void thirdTest() {
	  System.out.println("This is third test method......");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before test methodready made......");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after test method redy made......");
  }
  @AfterClass
  public void afterclass() {
	  System.out.println("after class");
  }

}
