package collectionsFrameWorkDay3;

import java.util.*;

public class Vector3 {
	public static void main(String[] args) {
		String str[] = new String[] { "Srihari", "ravi", "Sai", "Dixith" };
		System.out.println("Legth Of String" + str.length);

		Vector<String> vector = new Vector<>(10);
		for (String St : str) {
			vector.add(St);
		}

		ListIterator<String> ls = vector.listIterator();
		while (ls.hasNext()) {
			System.out.println(ls.next());
		}
	}

}
