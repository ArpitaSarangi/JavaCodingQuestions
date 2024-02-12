import java.util.Scanner;

public class MethodOverloading {

	public int area(int a, int b) {
		return a * b;
	}

	public int area(int a) {
		return a * a;
	}


	public static void main(String[] args) {

		// rectangle,square,cirle
		// output: area of the shape
		//Method Overloading Concept

		System.out.println("Please enter the shape :");
		Scanner sc = new Scanner(System.in);
		String shapeName = sc.nextLine();
		int area = 0;

		System.out.println("Entered the shape :" + shapeName);

		MethodOverloading d = new MethodOverloading();
		System.out.println(d.area(4, 5));
		System.out.println(d.area(5));

	}

}
