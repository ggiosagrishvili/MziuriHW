package Homework_27;
import java.util.*;

public class Dv4{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] array3 = {5, 6, 7, 8, 9};

        List<Integer> commonList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        for (int num : array1) {
            list1.add(num);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int num : array2) {
            if (list1.contains(num)) {
                list2.add(num);
            }
        }

        for (int num : array3) {
            if (list2.contains(num)) {
                commonList.add(num);
            }
        }

        for (int num : commonList) {
            System.out.print(num);
        }
    }
}
