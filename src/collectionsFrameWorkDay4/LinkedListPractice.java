package collectionsFrameWorkDay4;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {
	public static void main(String[] args) {
LinkedList<String> ll = new LinkedList<String>();
		ll.add("Sri");
		ll.add("Hari");
		ll.add("Srihari");
		ListIterator<String> list = ll.listIterator();
		while (list.hasNext())

		{

			System.out.println(list.next());

		}
	}

}
