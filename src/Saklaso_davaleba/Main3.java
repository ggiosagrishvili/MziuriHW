package Saklaso_davaleba;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {

        int[] list1 = {1,2,3,4};
        int[] list2 = {3,4,5,6};

        ArrayList<Integer> List = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]){
                    List.add(list1[i]);
                    break;
                }

            }

            System.out.println(List);

        }
    }
}
