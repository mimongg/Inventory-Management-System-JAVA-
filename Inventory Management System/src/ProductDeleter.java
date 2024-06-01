// ProductDeleter.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDeleter {
    public static boolean deleteProduct(String searchTerm) {
    boolean itemDeleted = false;
    try (Connection connection = DatabaseConnector.connect()) {
        String deleteQuery = "DELETE FROM products WHERE product_name = ?";
        try (PreparedStatement statement = connection.prepareStatement(deleteQuery)) {
            statement.setString(1, searchTerm);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                itemDeleted = true;
                System.out.println("Record(s) deleted successfully. Rows affected: " + rowsAffected);
            } else {
                System.out.println("No records found to delete.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return itemDeleted;
}

}
