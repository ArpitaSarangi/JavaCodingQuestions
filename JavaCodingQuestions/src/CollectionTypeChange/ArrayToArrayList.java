package CollectionTypeChange;

import java.util.*;


public class ArrayToArrayList {

	public static void main(String[] args) {

		int s[] = { 1, 2, 3, 4, 5 };

		ArrayList<Integer> al = new ArrayList<Integer>(s.length);

		for (int i = 0; i < s.length; i++) {
			al.add(s[i]);
		}

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
