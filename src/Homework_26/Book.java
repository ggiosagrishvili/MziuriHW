package Homework_26;
import java.io.*;
import java.util.*;

class Book implements Serializable {
    static final long serialVersionUID = 1L;
    String title;
    String author;
    String id;
    boolean isBorrowed;

    public Book(String title, String author, String id, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isBorrowed = isBorrowed;
    }


    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ID: " + id + ", Borrowed: " + (isBorrowed ? "Yes" : "No");
    }
}

class LibraryManagementSystem {
    private static final String fileName = "library_data.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Book> books = new ArrayList<>();
        books.add(new Book("კაცია ადამიანი", "ილია ჭავჭავაძე", "121212", true));
        books.add(new Book("განთიადი", "აკაკი წერეთელი", "121212", false));
        books.add(new Book("მთაწმინდის მთვარე", "გალაკტიონ ტაბიძე", "121212", true));
        books.add(new Book("ფიქრნი მტკვრის პირას", "ნ.ბარათაშვილი", "121212", false));



    }

    public static void save(List<Book> books) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("library_data.txt"));
        out.writeObject(books);
        out.close();
    }


    public static List<Book> load() throws IOException, ClassNotFoundException {
        List<Book> books;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("library_data.txt"));
        books = (List<Book>) in.readObject();
        in.close();
        return books;
    }

}
