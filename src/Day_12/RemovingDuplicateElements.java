package Day_12;

import java.util.HashSet;
import java.util.Set;
// Removing duplicate elements using set data structure
public class RemovingDuplicateElements {
    public static void main(String[] args) {
        int [] arr = {10, 20, 20, 30, 40, 40, 40, 50, 50};

        Set<Integer> hash_set = new HashSet<>();
        for(int i : arr){
            hash_set.add(i);
        }
        System.out.println(hash_set);
    }
}
