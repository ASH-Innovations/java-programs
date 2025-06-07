package day9ProgramsPractice;

import java.util.Arrays;

public class RemoveWithStreams {

	    public static void main(String[] args) {
	        int[] array = {1, 2, 1, 3, 5, 1};
	        int key = 1;

	        int[] result = Arrays.stream(array)
	                             .filter(n -> n != key)
	                             .toArray();

	        System.out.println("Output: " + Arrays.toString(result));
	    }
	}


