package CollectionTypeChange;
import java.util.*;

public class ListToSet {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("Arpita");
		l.add("Mama");
		l.add("Bapun");
		l.add("Avishek");
		l.add("Mama");
		
		System.out.println(l);
		
		
		Set<String> s=new HashSet<String>();
		
		for(String m:l) {
			s.add(m);
		}
		
		System.out.println(s);

		
	}

}
