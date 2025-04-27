package Homework_37;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Brian", "Bella", "David");

        List<String> namesStartingWithB = names.stream()
                .filter(name -> name.startsWith("B"))
                .collect(Collectors.toList());

        System.out.println("სიტყვები, რომლებიც იწყება B-ზე: " + namesStartingWithB);
    }
}
