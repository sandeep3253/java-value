import java.util.HashSet;
import java.util.Set;

public class intersection {
    public static Set<Integer> intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        
        for (int num : arr1) {
            set1.add(num);
        }
        
        for (int num : arr2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        System.out.println(intersection(arr1, arr2));  
    }
}
