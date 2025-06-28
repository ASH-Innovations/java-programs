package CollectionsPracticeday12;

import java.util.*;

public class ArrayListPractice1 {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 13, 14 };
		List<Integer> al = new ArrayList<>(Arrays.asList(arr));

		ListIterator<Integer> listOfElemetns = al.listIterator();
		while (listOfElemetns.hasNext()) {
			System.out.println(listOfElemetns.next());

		}
		int sumEven = 0;
		int sumOdd = 0;

		for (Integer list : al) {

			if (list % 2 == 0) {
				System.out.println("The number is even " + list);
				sumEven += list;

			} else {
				System.out.println("The number is odd " + list);
				sumOdd = sumOdd + list;

			}
		}

		System.out.println(sumEven);
		System.out.println(sumOdd);

	}

}
