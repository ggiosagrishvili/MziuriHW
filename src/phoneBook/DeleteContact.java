package phoneBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteContact {
    public static void delete(Connection connection){
        try{
            System.out.println("input phonebook_id:");
            Scanner scanner = new Scanner(System.in);
            int phonebook_id = scanner.nextInt();
            String deleteQuery = "DELETE FROM phonebook WHERE phonebook_id = ?;";
            PreparedStatement stmt = connection.prepareStatement(deleteQuery);
            stmt.setInt(1, phonebook_id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}