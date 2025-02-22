package Saklaso_davaleba;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[10];
        int[] count = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("sheiyvane sityvebiii!!!!!!");
            words[i] = scanner.nextLine();

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    if(words[i].equals(words[k])){
                        count[i]++;
                    }
                }
            }

            int max = 0;
            for (int j = 1; j < 10; j++) {
                if(count[j] > count[max]){
                    max = 1;
                }

            }
            System.out.println("yvelaze ganmeorebadia: " + words[max]);
        }
    }
}
