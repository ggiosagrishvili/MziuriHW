package Saklasodavaleba;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int start = x;
        int reversed = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            System.out.println("ამოვიღეთ ბოლო ციფრი: " + lastDigit);

            reversed = reversed * 10 + lastDigit;
            System.out.println("შევქმენით შებრუნებული რიცხვი: " + reversed);

            x = x / 10;
            System.out.println("დავაკლეთ ბოლო ციფრი, ახლა x = " + x);
        }

        if (start == reversed) {
            System.out.println("ავდაპირველი და შებრუნებული ტოლია.");
            return true;
        } else {
            System.out.println("თავდაპირველი და შებრუნებული არ არის ტოლი.");
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println("რიცხვი პალინდრომია? " + isPalindrome(x));
    }
}
