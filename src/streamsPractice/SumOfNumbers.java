package streamsPractice;

import java.util.*;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        Integer arr[] = {12, 12, 1};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum of numbers: " + sum);
    }

}
