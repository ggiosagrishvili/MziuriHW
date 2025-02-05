package Saklaso_davaleba;
import java.util.ArrayList;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);

            if(!list.contains(num)){
                list.add(num);
            }
        }
        System.out.print(list);
    }
}
