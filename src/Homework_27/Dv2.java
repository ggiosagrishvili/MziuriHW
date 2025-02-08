package Homework_27;
import java.util.ArrayList;
import java.util.Random;

public class Dv2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }

        int max = numbers[0];
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        for (int num : numbers) {
            System.out.print(num );
        }
        System.out.println( max + maxIndex);

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }

        int maxElement = numberList.get(0);
        int maxIndexInList = 0;
        for (int i = 1; i < numberList.size(); i++) {
            if (numberList.get(i) > maxElement) {
                maxElement = numberList.get(i);
                maxIndexInList = i;
            }
        }

        System.out.println(maxElement + maxIndexInList);
    }
}

