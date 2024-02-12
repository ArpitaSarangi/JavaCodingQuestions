package InheritanceConcepts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	public void testRun() {
		int a = 3;
		doThis();// parent class method

		PS2 ps2 = new PS2(3);// Parameterized Constructor
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());

		//PS3 ps3 = new PS3(a);
		//System.out.println(ps3.multiplyTwo());
		System.out.println(ps2.multiplyTwo());
	
	}

	
}
