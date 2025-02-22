package Saklaso33;

import java.util.*;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " - " + author + " - $" + price;
    }
}

class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}

class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Double.compare(b1.getPrice(), b2.getPrice());
    }
}

class Main3 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", "skibidi toilet", 29.99));
        books.add(new Book("Python Basics", "me", 24.99));
        books.add(new Book("C++ Fundamentals", "legoat!", 19.99));

        books.sort(new TitleComparator());
        System.out.println("Sorted by Title:");
        for (Book b : books) {
            System.out.println(b);
        }

        books.sort(new PriceComparator());
        System.out.println("Sorted by Price:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
