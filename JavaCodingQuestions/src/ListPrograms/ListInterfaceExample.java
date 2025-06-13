package ListPrograms;

import java.util.ArrayList;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ListInterfaceExample {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		System.out.println("Fruits name :"+fruits);
//		System.out.println(fruits.get(2));
//		System.out.println(fruits.size());
//		System.out.println(fruits.remove(0));
//		
//		System.out.println("Fruits name :"+fruits);
//		System.out.println(fruits.remove("Grapes"));
//		System.out.println("Fruits name :"+fruits);
		
		for(int i=0;i<fruits.size();i++)
		{
		System.out.println(fruits.get(i));	
		}
		System.out.println("*********************");
		
		for(String k:fruits) {
			System.out.println(k);
		}
		
		
		System.out.println(fruits.contains("Apple"));
	}

}
