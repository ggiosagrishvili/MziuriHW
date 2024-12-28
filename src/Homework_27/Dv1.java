package Homework_27;
import java.util.ArrayList;
import java.util.Random;

public class Dv1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random(5);
        int randomNumber;
        int max = 0;

        randomNumber = random.nextInt(1,10);
        numbers.add(randomNumber);

        System.out.println(numbers.size());
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < max) {
                numbers.get(i);
                i--;
            }
        }

        System.out.println("ლუწების წაშლის შემდეგ:");
        System.out.println("ლისტის სიგრძე: " + numbers.size());
        System.out.println("ელემენტების: " + numbers);
    }
}