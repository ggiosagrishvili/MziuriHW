package phoneBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchContact {
    public static void search(Connection connection){
        try{
            System.out.println("Please input phonebook_id:");
            Scanner scanner = new Scanner(System.in);
            int phonebook_id = scanner.nextInt();
            String searchQuery = "SELECT * FROM phonebook WHERE phonebook_id = ?;";
            PreparedStatement stmt = connection.prepareStatement(searchQuery);
            stmt.setInt(1, phonebook_id);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("phonebook_id");
                String phonebook_name = rs.getString("phonebook_name");
                String phonebook_lastname = rs.getString("phonebook_lastname");
                String phonebook_email = rs.getString("phonebook_email");
                String phonebook_number = rs.getString("phonebook_number");

                System.out.println("phonebook_id: " + id);
                System.out.println("phonebook_name: " + phonebook_name);
                System.out.println("phonebook_lastname: " + phonebook_lastname);
                System.out.println("phonebook_emnail: " + phonebook_email);
                System.out.println("phonebook_number: " + phonebook_number);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}