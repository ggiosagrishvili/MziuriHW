package Homework_36;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ მთელი რიცხვი:");
        int number = scanner.nextInt();

        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        if (isPrime.test(number)) {
            System.out.println(number + " არის მარტივი რიცხვი.");
        } else {
            System.out.println(number + " არ არის მარტივი რიცხვი.");
        }
    }
}
