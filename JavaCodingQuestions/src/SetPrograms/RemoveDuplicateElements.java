package SetPrograms;

import java.util.LinkedHashSet;
public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		String n="12121354684864864666 njkhoiljknm bjkguiukjb njkhuyhjn njkhoiljknm 12121354684864864666";
		String[] n1=n.split(" ");
		
		LinkedHashSet<String> st=new LinkedHashSet<String>();
		for(int i=0;i<n1.length;i++) {
			st.add(n1[i]);				
		}
		System.out.println(st);
		
	}

}
