package CollectionTypeChange;

import java.util.*;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mango");
		al.add("Orange");
		
		System.out.println(al);
		
		LinkedList<String> ll=new LinkedList<String>();
		for(String s:al) {
			ll.add(s);
		}

		
		System.out.println(ll);
		
	}

}
