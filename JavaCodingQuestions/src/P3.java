import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.By;

public class P3 {

	public static void main(String[] args) {
	/*
	5,1,2,4,5,6,7,8,9,7,8,10 —> I/p  -->Duplicate: 5,7,8
	Unique elements: 1,2,4,6,9,10,5,7,8	
	1,2,3,4,5,6,7,8,9,10,11,12 —> o/p
	(1,10)
	(11,20)
	(21,30)
	
	static v=1
	*/
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(5);al.add(1);al.add(2);al.add(4);al.add(5);al.add(6);
	al.add(7);al.add(8);al.add(9);al.add(7);al.add(8);al.add(10);
	
	System.out.println("Size of ArrayList: "+ al.size());
	
	for(int i=0;i<al.size();i++) {
		for(int j=i+1;j<al.size();j++) {
			if(al.get(i)==al.get(j)) {
			
				System.out.println("Duplicate value :"+ al.get(j));
				al.remove(j);
				break;
			}
		}
	}
	System.out.println(al);
	
	Collections.sort(al);
	System.out.println(al);
	
	
	}

}
