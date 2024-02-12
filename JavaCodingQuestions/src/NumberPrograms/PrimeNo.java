package NumberPrograms;

public class PrimeNo {

	public static void main(String[] args) {
		// Prime number or not!!

		int N=20;
		int count=0;
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime Number"+N);
		}else {
			System.out.println("Not a Prime Number"+N);
		}

	}

}
