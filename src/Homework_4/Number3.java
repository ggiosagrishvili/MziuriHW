package Homework_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Number3 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("F:\\input.txt");

        char[] symbols = new char[10];

        for (int i = 0; i < 10; i++) {
            symbols[i] = (char) fileInputStream.read();
        }

        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream("F:\\output.txt");

        for (char symbol : symbols) {
            fileOutputStream.write(symbol);
        }

        fileOutputStream.close();
    }
}

