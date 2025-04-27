package Homework_36;
import java.util.Scanner;
import java.util.function.Function;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ ტექსტი:");
        String input = scanner.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("შემობრუნებული ტექსტი: " + reversed);

        String finalReversed = reversed;
        Function<String, String> stringToString = string -> "ტექსტი:"+ finalReversed;
        System.out.println(stringToString.apply("გამარჯობა"));



    }
}

