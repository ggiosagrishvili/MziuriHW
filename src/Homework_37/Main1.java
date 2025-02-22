package Homework_37;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        int sumOfSquares = numbers.stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("კვადრატების ჯამი: " + sumOfSquares);
    }
}
