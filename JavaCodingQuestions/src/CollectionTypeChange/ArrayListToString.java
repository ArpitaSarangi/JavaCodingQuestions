package CollectionTypeChange;

import java.util.*;

public class ArrayListToString {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("1");al.add("2");
		al.add("3");al.add("4");
		
		System.out.println(al);
		
		String[] s=new String[al.size()];
		al.toString();
		
		for(int i=0;i<s.length;i++) {
			s[i]=al.get(i);
		}
		
		for(int i=0;i<s.length;i++) 
		System.out.println(s[i]);
	}

}
