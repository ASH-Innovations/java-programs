package day11Practice;

import java.util.*;
import java.util.Map.Entry;

public class MapPractice1 {

	public static void main(String[] args) {
		System.out.println("Execution starts from main method by JVM");
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "Sunday");
		map.put(1, "Monday");
		map.put(3, "Tuesday");
		map.put(4, "Wednesday");
		map.put(5, "Thursday");
		System.out.println(map);
		System.out.println();

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println();

		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}

		System.out.println(map.keySet());
		System.out.println(map.values());

		for (Entry<Integer, String> set : map.entrySet()) {
			System.out.println(set.getKey() + " == " + set.getValue());
		}

		System.out.println("Execution has been ended");
	}

}
