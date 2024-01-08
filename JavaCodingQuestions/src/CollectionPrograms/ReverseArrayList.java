package CollectionPrograms;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("1");
		al.add("11");
		al.add("10");
		al.add("12");
		al.add("13");
		al.add("14");
		al.add("15");
		al.add("16");
		al.add("17");
		al.add("18");
		System.out.println(al);
		ArrayList<String> al2=new ArrayList<>();
		
		
		for(int i=0;i<al.size();i++) {
			al2.add(i, al.get(al.size()-1-i));
		}
		System.out.println(al2);
		
	}

}
