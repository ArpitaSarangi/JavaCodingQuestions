package ExceptionHandling;

public class FinallyExample {

	public static void main(String[] args) {
		try {
			System.out.println("Connection opened");
			int num=10/0; //ArithmeticException
			
		}catch(ArithmeticException e) {
			System.out.println("Exception caught: "+e.getMessage());
		}finally {
			System.out.println("This block will always executed");
			System.out.println("Connection closed");
		}

	}

}
