package Java_Programs_for_QA_Interview;

import java.util.*;

public class LargestNumber {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 11, 10, 98, 67, 5 };
		TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(arr));
		System.out.println(treeSet);
		System.out.println(treeSet.last());
		System.out.println(treeSet.first());
		System.out.println(treeSet.descendingSet());

	}
}
