package CollectionsFrameWork_CollectionsInterface_VectorDay1Peactice;

import java.util.*;

public class ArrayListP1 {
	public static void main(String[] args) {
		Integer arr[] = { 90, 80, 45 };
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
	}

}
