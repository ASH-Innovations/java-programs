package collectionsFrameWorkDay4;

import java.util.*;

public class ArrayListP2 {
	public static void main(String[] args) {

		Integer[] array = new Integer[] { 8, 9, 12 };

		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
		System.out.println(arrayList);
		arrayList.add(0, 7);

		Integer[] array1 = new Integer[] { 10, 11 };
		ArrayList<Integer> arraylist1 = new ArrayList<>(Arrays.asList(array1));
		arrayList.addAll(3, arraylist1);
		// Retrieving elements with the help of reference variable
		System.out.println(arrayList);
		System.out.println();

		// Retrieving elements with the help of for loop
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println();

		// Retrieving elements with the help of enhanced for loop
		for (int list : arrayList) {
			System.out.println(list);
		}
		System.out.println();

		// Retrieving elements with the help of forEach loop
		arrayList.forEach(x -> System.out.println(x));
		System.out.println();

		// updating elements
		for (int i = 0; i < arrayList.size(); i++) {

			Integer data = arrayList.get(i);
			switch (data) {
			case 7:

				arrayList.set(i, 1);
				break;

			case 8:
				arrayList.set(i, 2);
				break;
			case 9:
				arrayList.set(i, 3);
				break;
			case 10:
				arrayList.set(i, 4);
				break;
			case 11:
				arrayList.set(i, 5);
				break;
			case 12:
				arrayList.set(i, 6);
				break;
			default:
				System.out.println("Nothing found");
				break;
			}

		}
		arrayList.forEach(n -> System.out.println(n));

		/*
		 * for (int i = arrayList.size() - 1; i >= 2; i--) { arrayList.remove(i); }
		 * System.out.println(arrayList);
		 */

		ListIterator<Integer> iterator = arrayList.listIterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.println("After removing the list " + arrayList);

		for (int i = 0; i <= 3; i++) {
			arrayList.add(i, i);
		}
		ListIterator<Integer> iterator1 = arrayList.listIterator();
		while (iterator1.hasNext()) {
			int value = iterator1.next();
			System.out.println(arrayList.get(value));

		}

	}
}
