package Homework_4;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Number2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("F:\\C:\\Users\\Gio\\IdeaProjects\\MziuriHomeworks\\src\\Homework_4\\masivi.txt");

        byte[] numbers = new byte[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            numbers[i] = (byte) fileInputStream.read();
            sum += numbers[i];

            fileInputStream.close();

            FileOutputStream fileOutputStream = new FileOutputStream("F:\\C:\\Users\\Gio\\IdeaProjects\\MziuriHomeworks\\src\\Homework_4\\masivi2.txt");

            for (byte number : numbers) {
                fileOutputStream.write((number));
            }

            String sumString = "\nSum: " + sum;
            fileOutputStream.write(sumString.getBytes());

            fileOutputStream.close();
        }}}
