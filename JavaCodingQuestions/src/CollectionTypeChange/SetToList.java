package CollectionTypeChange;

import java.util.*;

public class SetToList {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("Mama");
		s.add("Mummy");
		s.add("Papa");
		s.add("Bapun");
		s.add("Mama");
		
		System.out.println(s);
		
	List<String> l=new LinkedList<String>();
	
	for(String d:s) {
		l.add(d);
	}
		System.out.println(l);
		
		

	}

}
