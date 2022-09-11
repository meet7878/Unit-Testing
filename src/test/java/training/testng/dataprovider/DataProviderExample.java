package training.testng.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@DataProvider(name = "data-provider")
	private Object[][] dpMethod(){
		return new Object[][] {
			{"First Value"},
			{"Second Value"}
		};
	}
	
	@Test(dataProvider = "data-provider")
	public void dataProviderExampleTest(String val) {
		System.out.println("Parameter value is "+val);
	}
	
	@DataProvider(name = "data-provider-1")
	private Object[][] dpMethod1(){
		return new Object[][] {
			{1,2,3},
			{3,4,7},
			{4,4,8}
		};
	}
	
	@Test(dataProvider = "data-provider-1")
	public void dataProvider1ExampleTest(int a, int b, int c) {
		int sum=a+b;
		Assert.assertEquals(sum, c);
		//System.out.println("Parameter value is "+sum);
	}
	
}
