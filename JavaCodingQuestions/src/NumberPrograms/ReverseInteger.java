package NumberPrograms;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println("Enter new number");
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		int revNum=0;
		while(number>0) {
			revNum=number%10 + revNum*10;
			number=number/10;
			
			}
		System.out.println("Reversed Number : "+ revNum);

	}

}
