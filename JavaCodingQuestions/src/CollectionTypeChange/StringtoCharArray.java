package CollectionTypeChange;

public class StringtoCharArray {

	public static void main(String[] args) {
		String s="Arpita is very very good.";
		
		char[] c=new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		
		for(char m:c) {
		System.out.print(m);
		}
	}

}
