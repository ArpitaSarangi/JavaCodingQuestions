package CollectionTypeChange;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Mama");
		al.add("Mama1");
		al.add("Mama2");
		al.add("Mama3");
		al.add("Mama4");
		al.add("Mama5");
		al.add("Mama6");
		al.add("Mama7");
		al.add("Mama8");
		System.out.println(al);
		
		
		String f[]=new String[al.size()];
		//al.toArray(f);
		
		for(int i=0;i<f.length;i++) {
			f[i]=al.get(i);
			System.out.print(f[i]);
		}
		
	}

}
