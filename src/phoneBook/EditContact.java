package phoneBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EditContact {
    public static void edit(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter new phonebook_name, phonebook_lastname, phonebook_email ,phonebook_number and phonebook_id:");
            String editQuery = "UPDATE phonebook SET phonebook_name = ?, phonebook_lastname = ?, phonebook_email = ? ,phonebook_number = ? WHERE phonebook_id = ?";
            PreparedStatement stmt = connection.prepareStatement(editQuery);

            String firstName = scanner.next();
            String lastName = scanner.next();
            String Email = scanner.next();
            String contactNumber = scanner.next();
            int contactId = scanner.nextInt();

            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, Email);
            stmt.setString(4, contactNumber);
            stmt.setInt(5, contactId);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Contact updated successfully!");
            } else {
                System.out.println("Cant edit contact");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
