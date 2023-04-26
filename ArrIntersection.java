package Assignment7;
import java.util.HashSet;
public class ArrIntersection {
   public static int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6};
        int[] arr2 = {4,5,6,7,8};
        int[] intersect = intersection(arr1, arr2);
        System.out.print("Intersection of arr1 and arr2: ");
        for (int num : intersect) {
            System.out.print(num + " ");
        }
    }
}
