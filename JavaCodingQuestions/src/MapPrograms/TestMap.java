package MapPrograms;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Integer> fruitPrices=new HashMap<>();
		
		fruitPrices.put("Apple", 34);
		fruitPrices.put("Orange", 50);
		fruitPrices.put("Mango", 170);
		fruitPrices.put("Papaya", 45);
		
		System.out.println(fruitPrices);
		System.out.println(fruitPrices.values());
		System.out.println(fruitPrices.keySet());
		
		
		System.out.println(fruitPrices.get("Mango"));
		
		System.out.println(fruitPrices.containsValue(45));
		
		
		for(Map.Entry<String, Integer>  entry:fruitPrices.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
