package day9ProgramsPractice;

public class RemoveApproach2 {

	    public static void main(String[] args) {
	        int[] array = {1, 2, 1, 3, 5, 1};
	        int key = 1;
	        int n = array.length;
	        int j = 0;  // index for placing non-key elements

	        for (int i = 0; i < n; i++) {
	            if (array[i] != key) {
	                array[j++] = array[i];
	            }
	        }

	        // Print only the first j elements (non-key values)
	        System.out.print("Output: [");
	        for (int i = 0; i < j; i++) {
	            System.out.print(array[i]);
	            if (i < j - 1) System.out.print(", ");
	        }
	        System.out.println("]");
	    }
	
}
