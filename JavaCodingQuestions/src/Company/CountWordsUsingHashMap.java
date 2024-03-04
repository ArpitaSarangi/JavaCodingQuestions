package Company;
import org.testng.annotations.Test;
import java.util.*;

public class CountWordsUsingHashMap {
	
	@Test
	void m2() {
		
		
		//Count the number of words in a string using HashMap
		String m= "This this is a string";
		
		String[] p=m.split(" ");
		//System.out.println("Count of words in the string is: "+p.length);
		
		int count=1;
		
		Map<String,Integer> mp=new LinkedHashMap<>();
		for(int i=0;i<p.length;i++) {
			
			mp.put( p[i],count);
			count++;
		}
		
		
		System.out.println("Count the number of words in a"
				+ " string using HashMap : "+ mp.size()+ ": "+mp  );
	
		
		
	}
}
