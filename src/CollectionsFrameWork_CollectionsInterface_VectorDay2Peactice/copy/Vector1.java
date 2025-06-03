package CollectionsFrameWork_CollectionsInterface_VectorDay2Peactice.copy;

import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Object> vector1 = new Vector<>();

		System.out.println("");
		vector1.add("sunday");
		vector1.add("Tuesday");
		vector1.add(1, "Monday");
		System.out.println("Vector1 Collection is: " + vector1);

		Vector<Object> vector2 = new Vector<>();
		vector2.addAll(vector1);
		vector2.add("Wednessday");
		vector2.add("Thursday");
		vector2.add("Friday");
		vector2.add("Saturday");
		System.out.println("Vector2 Collection is " + vector2);
		System.out.println(vector2.lastElement());
		System.out.println("Last Element from Vector is: " + vector2.lastIndexOf("Saturday"));

		vector2.remove(vector2.lastElement());

	}

}
