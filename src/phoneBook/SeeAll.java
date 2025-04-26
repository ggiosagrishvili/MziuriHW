package phoneBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeeAll {
    public static void see(Connection connection){
        try {
            String searchQuery = "SELECT * FROM phonebook ORDER BY phonebook_id ASC;";
            PreparedStatement stmt = connection.prepareStatement(searchQuery);
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
                System.out.println("phonebook_email: " + phonebook_email);
                System.out.println("phonebook_number: " + phonebook_number);
                System.out.println();
            }
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}