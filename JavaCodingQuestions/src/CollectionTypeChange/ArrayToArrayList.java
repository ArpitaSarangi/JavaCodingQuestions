package CollectionTypeChange;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		String s[]={"This","is"," a" ,"string"," which"," I want"," to", "convert"," into"," a"," ArrayList"," of"," string"," type."};
		
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		System.out.println(al);
	}

}
