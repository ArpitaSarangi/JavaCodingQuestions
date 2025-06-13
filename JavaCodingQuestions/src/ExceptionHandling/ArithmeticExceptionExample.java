package ExceptionHandling;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		try {
			int a=10,b=0;
			int result=a/b; // This will cause Arithmetic Exception
			System.out.println("Result: "+result);
		}catch(ArithmeticException e) {
			System.out.println("Exception caught: Can't divide by Zero");
		}

	}

}
