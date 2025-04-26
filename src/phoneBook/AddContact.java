package phoneBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddContact {
    public static void add(Connection connection){
        try{
            System.out.println("phonebook_name, phonebook_lastname, phonebook_email ,phonebook_number:");
            Scanner scanner = new Scanner(System.in);
            String insertQuery = "INSERT INTO phonebook(phonebook_name, phonebook_lastname, phonebook_email ,phonebook_number) VALUES(?, ?, ?, ?);";

            String firstName = scanner.next();
            String lastName = scanner.next();
            String Email = scanner.next();
            String contactNumber = scanner.next();

            PreparedStatement stmt = connection.prepareStatement(insertQuery);

            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, Email);
            stmt.setString(4, contactNumber);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Contact added successfully!");
            } else {
                System.out.println("Contact can not added.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
