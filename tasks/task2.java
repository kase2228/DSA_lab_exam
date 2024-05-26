
import java.util.*;
public class task2{
class TwoSum {
    public static int[] twoSum(int[] myList, int target) {
        for (int i = 0; i < myList.length; i++) {
            for (int j = i + 1; j < myList.length; j++) {
                if (myList[i] + myList[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}

 public static void main(String[] args){
    int[] a={1,2,3,4,5};
    int k=3;
    System.out.print(Arrays.toString(TwoSum.twoSum(a, k)));
 }
}
    





