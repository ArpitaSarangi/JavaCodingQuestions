
public class SubClassOfAbstractClass extends AbstractClassDemo {

	public static void main(String[] args) {
		AbstractClassDemo a = new SubClassOfAbstractClass();
		a.m1();
		a.m2();
		a.m3();

	}

	@Override
	void m3() {

		System.out.println("abstract method m3 implemented");

	}

}
