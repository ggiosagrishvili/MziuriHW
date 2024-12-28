package Homework_4;

import java.io.FileOutputStream;
import java.io.IOException;

public class NumberWriter {
    public static void main(String[] args) throws IOException {

        int[] numbers = {5, 12, 43, 8, 67, 23, 11};

        FileOutputStream fileOutputStream = new FileOutputStream("F:\\numbers.txt");

        fileOutputStream.write(String.valueOf(numbers.length).getBytes());

        for (int number : numbers) {
            fileOutputStream.write(String.valueOf(number).getBytes());
            fileOutputStream.write(" ".getBytes());
        }

        fileOutputStream.close();
    }
}
