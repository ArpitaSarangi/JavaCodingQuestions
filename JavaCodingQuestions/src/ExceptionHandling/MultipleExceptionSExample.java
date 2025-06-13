package ExceptionHandling;

public class MultipleExceptionSExample {

	public static void main(String[] args) {
		try {
			int arr[]= {10,20,30};
			System.out.println(arr[5]);// ArrayIndexOutOfBound Exception
			int result=10/0;//ArithmeticException
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array Index out of Bounds !");
		}
		catch(ArithmeticException e) {
			System.out.println("Error : Division by Zero !!");
		}

	}

}
