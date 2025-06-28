import java.util.*;

public class HasSetP1 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(25);
        hashSet.add(5);
        hashSet.add(15);
        hashSet.add(10);
        hashSet.add(20);

        System.out.println("HashSet output (no guaranteed order):");
        for (Integer num : hashSet) {
            System.out.println(num);
        }

        System.out.println("\nTreeSet output (sorted order):");
        Set<Integer> treeSet = new TreeSet<>(hashSet);
        for (Integer num : treeSet) {
            System.out.println(num);
        }
    }
}
