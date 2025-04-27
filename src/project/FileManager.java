package project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FileManager {
    private static final String File = "C:\\Users\\Gio\\IdeaProjects\\MziuriHomeworks\\src\\project\\PhoneBook.txt";

    public static void saveToFile(List<Contact> contacts) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(File))) {
            outputStream.writeObject(contacts);
        }
    }

    public static List<Contact> readFromFile() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(File))) {
            return (List<Contact>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        }
    }
}