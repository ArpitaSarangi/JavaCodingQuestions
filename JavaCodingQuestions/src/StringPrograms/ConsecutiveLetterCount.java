package StringPrograms;

public class ConsecutiveLetterCount {

	public static void main(String[] args) {
		String m = "AAABBCCDDD";
		//Output: A3B2C2D3
		int count=1;
		
		for(int i=0;i<m.length();i++) {
			if((i!=m.length()-1 ) && m.charAt(i)==m.charAt(i+1)) {
				count++;
			}else {				
				System.out.print(m.charAt(i)+""+count);
				count=1;
			}
		}

		
		/*
		 * 
		String s="aabbbcccc";
		int count=1;
		

				//Ouput:2a3b4c
		//ArrayList<String> a=new ArrayList<String>(s.length());
				
				for(int i=0;i<s.length();i++) {
					if((i!=s.length()-1) && s.charAt(i)==(s.charAt(i+1))) {
						count++;
					}else {
					System.out.print(count+""+s.charAt(i));
					count=1;
					}
				}
			
		 */
	}

}
