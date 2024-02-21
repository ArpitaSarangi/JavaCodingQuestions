package CollectionTypeChange;

import java.util.*;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("mama");
		ll.add("bapun");
		ll.add("mummy");
		ll.add("Papa");

		System.out.println(ll);

		ArrayList<String> al = new ArrayList<String>();

		for (String l : ll) {
			al.add(l);
		}

		System.out.println(al);

	}

}
