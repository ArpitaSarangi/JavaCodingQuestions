package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
				//your code goes here
				//reverse string: ereh seog edoc ruoy
				String org="your code goes here";
				String revString=" ";
				for(int i=org.length()-1;i>=0;i--){
				    revString+=org.charAt(i);
				}
				System.out.println("Message :"+revString);

	}

}
