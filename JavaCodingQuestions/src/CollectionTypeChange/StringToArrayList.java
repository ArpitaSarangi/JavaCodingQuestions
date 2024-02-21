package CollectionTypeChange;

import java.util.*;

public class StringToArrayList {

	public static void main(String[] args) {
		String s="Arpita is very good.";
		String[] m=s.split(" ");
		
		ArrayList<String> al=new ArrayList<String>();
		
		for(String b:m) {
			al.add(b);
		}
		
		System.out.println(al);

	}

}
