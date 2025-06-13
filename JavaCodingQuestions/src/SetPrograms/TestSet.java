package SetPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> fruts=new TreeSet<String>();
		
		
		fruts.add("Apple");
		fruts.add("Mango");
		fruts.add("Banana");
		fruts.add("Orange");
		fruts.add("Apple2");
		fruts.add("Banana2");
		fruts.add("Banana2");
		fruts.add("Orange2");
		//fruts.clear();
		
		System.out.println(fruts.contains("Orange2"));
		
		System.out.println(fruts);

	}

}
