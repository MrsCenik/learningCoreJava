package day34maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap02 {

	public static void main(String[] args) {
		// How to iterate in HashMap
		
		HashMap<Integer, String> hm1 = new HashMap<>();	
		hm1.put(100, "Ali Can");
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone");
		hm1.put(103, "Angie Ocean");
		
		System.out.println(hm1); // {100=Ali Can, 101=Veli Han, 102=Mark Stone, 103=Angie Ocean}

		
		//1.Way: Use for-each loop and Map.EntrySet()
		//To convert a Map to a collection, you need to use entrySet() method
		
		
										//convert the map to set with entrySet() method
		for(Map.Entry<Integer, String>w: hm1.entrySet()) {
			
			System.out.print(w.getKey()+" ");
			
			System.out.print(" ");
			
			System.out.print(w.getValue()+ " ");
		}
		
		//2.Way: Iterator on Map.Entry<K, V>
													//convert the map to set with entrySet() method
		Iterator<Map.Entry<Integer, String>> hm1Itr = hm1.entrySet().iterator();
		System.out.println("");
		while(hm1Itr.hasNext()) {
			Map.Entry<Integer, String> entry = hm1Itr.next();
			
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
			
		}

	}

}
