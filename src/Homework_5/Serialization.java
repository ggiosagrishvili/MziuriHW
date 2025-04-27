//package Homework_5;
//
//import Homework_26.Book;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutput;
//import java.io.ObjectOutputStream;
//
//public class Serialization {
//    public static void main(String[] args)throws IOException {
//        Triangle t=new Triangle();
//        t.a=3;
//        t.b=4;
//        t.c=5;
//
//
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Gio\\IdeaProjects\\MziuriHomeworks\\src\\Homework_5\\triangle");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(t);
//        objectOutputStream.close();
//        fileOutputStream.close();
//
//    }
//}
//
//Book book1 = new Book("კაცია ადამიანი", "ილია ჭავჭავაძე", "121212", true);
//Book book2 = new Book("განთიადი", "აკაკი წერეთელი", "121212", false);
//Book book3 = new Book("მთაწმინდის მთვარე", "გალაკტიონ ტაბიძე", "121212", true);
//Book book4 = new Book("ფიქრნი მტკვრის პირას", "ნ.ბარათაშვილი", "121212", false);