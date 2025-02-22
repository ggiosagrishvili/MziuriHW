package Saklaso_davaleba;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("shiyvane texti: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int count = 0;


            for (int j = 0; j < text.length(); j++) {
                if( c == text.charAt(j)){
                    count++;
                }
            }

           boolean printed = false;
            for (int k = 0; k < i; k++) {
                if (text.charAt(k) == c){
                    printed = true;
                    break;
                }
            }
            if(!printed){
                System.out.println(c  + "=" +  count);
            }
        }
    }
}
