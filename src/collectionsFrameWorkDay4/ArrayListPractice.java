package collectionsFrameWorkDay4;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListPractice {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		System.out.println("Default Capacity is:  " + vector.capacity());
		vector.add(10);
		vector.add(13);
		vector.add(1, 11);
		vector.add(2, 12);
//Printing elements directly by taking the reference variable
		System.out.println(vector);
//Printing elements by for loop
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		System.out.println();
//printing elements with enhanced for loop
		for (int n : vector) {
			System.out.println(n);
		}
		System.out.println();

//Printing elements with forEach

		vector.forEach(n -> System.out.println(n));

		ArrayList<String> arraylist = new ArrayList<>();

		String[] elements = { "Sunday", "Monday", "Tuesday", "Wednessday", "Friday", "Thursday" };
		for (int i = 0; i < elements.length; i++) {
			arraylist.add(elements[i]);

		}
		// printing elements with the help of reference variable directly
		System.out.println(arraylist);
		System.out.println();

		// printing elements with the help of for loop
		for (int i = 0; i < elements.length; i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println();
		// Printing elements with the help of enhanced for loop
		for (String element : arraylist) {
			System.out.println(element);

		}
		System.out.println();
		// Retrieving elements with the help of forEach
		arraylist.forEach(n -> System.out.println(n));
	}

}
