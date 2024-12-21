package Homework_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Number1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:/Users/Gio/IdeaProjects/MziuriHomeworks/src");
        int byteContent;

        while ((byteContent = fileInputStream.read()) != -1) {
            System.out.print((char) byteContent);
        }

        fileInputStream.close();

        System.out.println("");

        String str = "Hello world";
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Gio/IdeaProjects/MziuriHomeworks");
        byte[] b = str.getBytes();
        fileOutputStream.write(b);
        fileOutputStream.close();
    }
}
