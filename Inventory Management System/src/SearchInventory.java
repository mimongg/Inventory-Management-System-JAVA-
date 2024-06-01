// ProductReader.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchInventory {
    public static int productId;
    public static String productName;
    public static String category;
    public static String brand ;
    public static String supplier;
    public static String unitCost;
    public static String quantity;
    public static String sellingPrice;
    public static String location;
    public static String modified;
    
    public static boolean readProduct(String searchTerm) {
        boolean itemFound = false;
        try (Connection connection = DatabaseConnector.connect()) {
            String query = "SELECT * FROM products WHERE product_name = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, searchTerm); // Use exact match
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        productId = resultSet.getInt("product_id");
                        productName = resultSet.getString("product_name");
                        category = resultSet.getString("category");
                        brand = resultSet.getString("brand");
                        supplier = resultSet.getString("supplier");
                        double unitCostNum = resultSet.getDouble("unit_cost");
                        unitCost = Double.toString(unitCostNum);
                        int quantityNum = resultSet.getInt("quantity");
                        quantity = Integer.toString(quantityNum);
                        double sellingPriceNum = resultSet.getDouble("selling_price");
                        sellingPrice = Double.toString(sellingPriceNum);
                        location = resultSet.getString("location");
                        modified = resultSet.getString("lastmodified");
                        itemFound = true;
                        System.out.println("Product ID: " + productId + ", Product Name: " + productName + ", Category: " + category
                                + ", Brand: " + brand + ", Supplier: " + supplier + ", Unit Cost: " + unitCostNum
                                + ", Quantity: " + quantityNum + ", Selling Price: " + sellingPriceNum + ", Location: " + location);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemFound;
    }

}
