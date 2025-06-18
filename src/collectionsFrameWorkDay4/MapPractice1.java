package collectionsFrameWorkDay4;

import java.util.*;
import java.util.Map.Entry;

public class MapPractice1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Srihari");
		map.put(2, "Shyam");
		map.put(3, "Tam");
		// Printing the values using ref variable
		System.out.println(map);
		System.out.println();

		// Printing the Keys using enhanced for loop
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}
		System.out.println();

		// Printing the specific value by using get method
		System.out.println(map.get(1));
		System.out.println();

		// Printing the Key and values by using enhanced for loop with get method

		for (Integer key : keys) {
			System.out.println(key + " <<<<<<<<<<< " + map.get(key));
		}
		System.out.println();

		// Printing the entries(Keys&values) by using enhanced for loop with entrySet
		// method
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " <<<>>> " + value);
		}
		System.out.println();

		// printing the keys and values with for loop
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
		System.out.println();

		// Verification of keys
		System.out.println(map.containsKey(1));

		System.out.println(map.containsKey(5));

		// Verification of Values
		System.out.println(map.containsValue("Srihari"));

		// modify the map
		map.replace(2, "TomCruice");

		System.out.println(map);

	}
}