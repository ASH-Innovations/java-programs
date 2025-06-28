package CollectionsPracticeday12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hasss {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(25);
		hashSet.add(5);
		hashSet.add(15);
		hashSet.add(10);
		hashSet.add(20);

		System.out.println("HashSet output (no guaranteed order):");
		for (Integer num : hashSet) {
			System.out.println(num);
		}

		System.out.println("LinkedHashSet output (Insertion order preserved)");
		Set<Integer> linkedHasSet = new LinkedHashSet<>();
		linkedHasSet.add(13);
		linkedHasSet.add(12);
		for (Integer num1 : linkedHasSet) {
			System.out.println(num1);
		}

		System.out.println("\nTreeSet output (sorted order):");
		Set<Integer> treeSet = new TreeSet<>(hashSet);
		for (Integer num : treeSet) {
			System.out.println(num);
		}
	}
}
