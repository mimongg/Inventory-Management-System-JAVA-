import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductFetcher {
    public static List<String> getAllProductNames() throws SQLException {
        List<String> productNames = new ArrayList<>();
        try (Connection connection = DatabaseConnector.connect()) {
            String query = "SELECT product_name FROM products";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    productNames.add(resultSet.getString("product_name"));
                }
            }
        }
        return productNames;
    }
}
