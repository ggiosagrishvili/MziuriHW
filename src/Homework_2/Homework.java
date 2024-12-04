package Homework_2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        String input = "1234 და 23232 და 3333";
        int Count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                Count++;
            }
        }

        System.out.println("ციფრების რაოდენობა არის: " + Count);









        String str = "apple, banana, cherry, yes,";

        String[] fruits = str.split(",");

        for (String f: fruits) {
            System.out.println(f);
        }







        String s1 = "Hello, world!";
        String s2 = "world";

            if (s1.contains(s2)) {
                System.out.println("s2 არის s1-ს ქვესტრიქონი");
            } else {
                System.out.println("s2 არ არის s1-ს ქვესტრიქონი");
            }







            Scanner scanner = new Scanner(System.in);

            System.out.print("შეიყვანეთ სიტყვა: ");
            String input1 = scanner.nextLine();

            StringBuilder originalWord = new StringBuilder();

            for (int i = 0; i < input1.length(); i++) {
                if (i == 0 || input1.charAt(i) != input1.charAt(i - 1)) {
                    originalWord.append(input1.charAt(i));
                }
            }

            System.out.println("თავდაპირველი სიტყვა: " + originalWord);



    }
}

