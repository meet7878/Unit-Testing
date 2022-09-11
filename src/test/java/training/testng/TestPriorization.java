package training.testng;

import org.testng.annotations.Test;

public class TestPriorization {


	@Test(priority = 1, groups = "Regression")//priority provided to all the test method 
	public void createPatient() {
		System.out.println("This test will create a patient");
	}
	
	@Test(priority = 2, dependsOnMethods = "createPatient",groups = "Regression")//this method is dependent on createPatient
	public void updatePatient() {
		System.out.println("This test will update a patient");
	}
	
	@Test(priority = 3, dependsOnMethods = "createPatient",groups = {"Regression","Smoke"})
	public void deletePatient() {
		System.out.println("This test will delete a patient");
	}
}
