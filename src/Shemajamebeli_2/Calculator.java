package Shemajamebeli_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ricxvi");
        int num1 = scanner.nextInt();

        System.out.println("operacia");
        char operation = scanner.next().charAt(0);

        System.out.println("meore ricxvi");
        int num2 = scanner.nextInt();

        int result = 0;
        boolean valid = true;
        switch(operation){
            case '+':
                result = num1 + num2;
            case '-':
                result = num1 - num2;
            case '*':
                result = num1 * num2;
            case '/':
                result = num1 + num2;
        }

        System.out.println(result);
} }