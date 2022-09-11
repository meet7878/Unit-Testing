package training.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {

	@Parameters({"environment"})//it gets value from .xml
	@Test
	public void Testone(@Optional("ism") String environment ) {//it gets value form @parameter
		System.out.println("parameter annotation Enviornment"+ environment);
	}
}
