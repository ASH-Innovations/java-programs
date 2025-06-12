package collectionsFrameWorkDay3;

import java.util.Iterator;
import java.util.Vector;

public class VectorPractice1 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		System.out.println("vector Capacity " + vector.capacity());
		System.out.println("vector size " + vector.size());

		vector.add("Sunday");
		vector.add("Monday");
		vector.add("Tuesday");
		vector.add("Thursday");
		vector.add(3, "Wednesday"); // fixed spelling
		vector.add("Friday");
		vector.add("Saturday");

		System.out.println("Vector Elements: " + vector);
		System.out.println("vector size " + vector.size());

		System.out.println("---- Elements in Vector ----");
		for (String day : vector) {
		    System.out.println(day);
		}

		System.out.println("Element at index 4: " + vector.get(4));
		System.out.println("First Element: " + vector.firstElement());
		System.out.println("Last Element: " + vector.lastElement());
		System.out.println("Index of 'Sunday': " + vector.indexOf("Sunday"));
		System.out.println("Last Index of 'Saturday': " + vector.lastIndexOf("Saturday"));
	}

}
