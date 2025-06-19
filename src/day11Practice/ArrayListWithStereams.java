package day11Practice;

import java.util.*;

public class ArrayListWithStereams {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(12, 23, 34, 56, 67, 78, 89,1));
		list.stream().forEach(System.out::println);
		Collections.sort(list);
		System.out.println(list);

	}

}
