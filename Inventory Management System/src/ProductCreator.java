import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ProductCreator {

    public static boolean createProduct(String productName, String category, String brand, String supplier,
                                        double unitCost, int quantity, double sellingPrice, String location) {
        boolean isCreated = false;
        try (Connection connection = DatabaseConnector.connect()) {
            String query = "INSERT INTO products (product_name, category, brand, supplier, unit_cost, quantity, selling_price, location, lastmodified) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, productName);
                statement.setString(2, category);
                statement.setString(3, brand);
                statement.setString(4, supplier);
                statement.setDouble(5, unitCost);
                statement.setInt(6, quantity);
                statement.setDouble(7, sellingPrice);
                statement.setString(8, location);
                try {
                    statement.setTimestamp(9, new Timestamp(System.currentTimeMillis()));
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    isCreated = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isCreated;
    }
}
