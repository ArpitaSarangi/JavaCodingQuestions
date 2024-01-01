package InheritanceConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	// methods,variables
	public void doThis() {
		System.out.println("I am in PS.");

	}

	@BeforeMethod
	public void beforeRun() {
		System.out.println("Run me first");
	}

	@AfterMethod
	public void afterRun() {
		System.out.println("Run me last");

	}

}
