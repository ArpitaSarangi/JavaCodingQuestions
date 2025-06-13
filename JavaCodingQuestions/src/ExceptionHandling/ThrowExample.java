package ExceptionHandling;

public class ThrowExample {
	
	
	public static void checkAge(int age) {
		if (age<18) {
			throw new IllegalArgumentException("Not Eligible to Vote");// Throws exception Manually 
			
		}else {
			System.out.println("You can Vote");
			
		}
	}

	public static void main(String[] args) {
		
		ThrowExample.checkAge(25);//pass an invalid age

	}

}
