package Homework_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Number1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("F:\\C:\\Users\\Gio\\IdeaProjects\\MziuriHomeworks\\src\\Homework_4\\number1.txt");
        int byteContent;

        while ((byteContent = fileInputStream.read()) != -1) {
            System.out.print((char) byteContent);
        }

        fileInputStream.close();

        System.out.println("");

        String str = "Hello world";
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\C:\\Users\\Gio\\IdeaProjects\\MziuriHomeworks\\src\\Homework_4\\test2.txt");
        byte[] b = str.getBytes();
        fileOutputStream.write(b);
        fileOutputStream.close();
    }
}
