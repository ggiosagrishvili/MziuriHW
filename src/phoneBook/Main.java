package phoneBook;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/6PhoneBook";
        String user = "postgres";
        File obj = new File("C:\\Users\\Gio\\IdeaProjects\\MziuriHomeworks\\src\\phoneBook\\password1");
        Scanner myReader = new Scanner(obj);
        String password = "";
        while (myReader.hasNext()){
            password = myReader.nextLine();
        }

        myReader.close();

        try{
            Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("connected to database!");

            System.out.println("choose command");
            System.out.println("1: Search in contacts");
            System.out.println("2: Add new contact");
            System.out.println("3: Delete contact");
            System.out.println("4: Edit contact");
            System.out.println("5: See all contacts");

            String choice = scanner.next();

            switch (choice){
                case "1":
                    SearchContact.search(connection);
                    break;
                case "2":
                    AddContact.add(connection);
                    break;
                case "3":
                    DeleteContact.delete(connection);
                    break;
                case "4":
                    EditContact.edit(connection);
                    break;
                case "5":
                    SeeAll.see(connection);
                default:
                    System.out.println("input right number!");
                    break;
            }
        }   catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}