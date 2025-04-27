package Homework_36;
import java.util.function.Consumer;

public class Main2 {
    public static void main(String[] args) {
        Consumer<String> logMessage = message -> {
            if (message.contains("System crash")) {
                System.out.println("ERROR");
            } else if (message.contains("Low disk space")) {
                System.out.println("WARNING");
            } else if (message.contains("Database connected!")) {
                System.out.println("INFO");
            } else {
                System.out.println("INFO");
            }
        };

        logMessage.accept("Database connected!");
        logMessage.accept("Low disk space");
        logMessage.accept("System crash");
        logMessage.accept("გამარჯობა");
    }
}
