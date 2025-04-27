package Homework_36;
import java.util.Random;
import java.util.function.Supplier;

class Main1 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int randomInt = random.nextInt(1, 10);
            System.out.println(randomInt);

            Supplier<Integer> supplier = () -> randomInt;
            System.out.print(supplier.get());
        }
    }
}
