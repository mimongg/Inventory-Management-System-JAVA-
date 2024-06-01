// ProductUpdater.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ProductUpdater {
    public static boolean updateCategory(int productId, String newCategory) throws SQLException {
        boolean isUpdated = false;
        try (Connection connection = DatabaseConnector.connect()) {
            String updateQuery = "UPDATE products SET category = ?, lastmodified = ? WHERE product_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
                statement.setString(1, newCategory);
                statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
                statement.setInt(3, productId);

                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Category updated successfully.");
                    isUpdated = true;
                } else {
                    System.out.println("Failed to update the category. No matching product found.");
                }
            }
        }
        return isUpdated;
    }
    
    
    public static boolean updateBrand(int productId, String newBrand) throws SQLException {
        boolean isUpdated = false;
        try (Connection connection = DatabaseConnector.connect()) {
            String updateQuery = "UPDATE products SET brand = ?, lastmodified = ? WHERE product_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
                statement.setString(1, newBrand);
                statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
                statement.setInt(3, productId);

                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Brand updated successfully.");
                    isUpdated = true;
                } else {
                    System.out.println("Failed to update the brand. No matching product found.");
                }
            }
        }
        return isUpdated;
    }
    
    
    public static boolean updateSupplier(int productId, String newSupplier) throws SQLException {
        boolean isUpdated = false;
        try (Connection connection = DatabaseConnector.connect()) {
            String updateQuery = "UPDATE products SET supplier = ?, lastmodified = ? WHERE product_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
                statement.setString(1, newSupplier);
                statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
                statement.setInt(3, productId);

                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Supplier updated successfully.");
                    isUpdated = true;
                } else {
                    System.out.println("Failed to update the supplier. No matching product found.");
                }
            }
        }
        return isUpdated;
    }
    
    
    public static boolean updateQuantity(int productId, int newQuantity) throws SQLException {
    boolean isUpdated = false;
    try (Connection connection = DatabaseConnector.connect()) {
        String updateQuery = "UPDATE products SET quantity = ?, lastmodified = ? WHERE product_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
            statement.setInt(1, newQuantity);
            statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            statement.setInt(3, productId);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Quantity updated successfully.");
                isUpdated = true;
            } else {
                System.out.println("Failed to update the quantity. No matching product found.");
            }
        }
    }
    return isUpdated;
    }
    
    
    public static boolean updateUnitCost(int productId, double newUnitCost) throws SQLException {
    boolean isUpdated = false;
    try (Connection connection = DatabaseConnector.connect()) {
        String updateQuery = "UPDATE products SET unit_cost = ?, lastmodified = ? WHERE product_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
            statement.setDouble(1, newUnitCost);
            statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            statement.setInt(3, productId);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Unit cost updated successfully.");
                isUpdated = true;
            } else {
                System.out.println("Failed to update the unit cost. No matching product found.");
            }
        }
    }
    return isUpdated;
}

    
    public static boolean updateLocation(int productId, String newLocation) throws SQLException {
    boolean isUpdated = false;
    try (Connection connection = DatabaseConnector.connect()) {
        String updateQuery = "UPDATE products SET location = ?, lastmodified = ? WHERE product_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
            statement.setString(1, newLocation);
            statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            statement.setInt(3, productId);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Location updated successfully.");
                isUpdated = true;
            } else {
                System.out.println("Failed to update the location. No matching product found.");
            }
        }
    }
    return isUpdated;
}
    
    
    public static boolean updateSellingPrice(int productId, double newSellingPrice) throws SQLException {
    boolean isUpdated = false;
    try (Connection connection = DatabaseConnector.connect()) {
        String updateQuery = "UPDATE products SET selling_price = ?, lastmodified = ? WHERE product_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
            statement.setDouble(1, newSellingPrice);
            statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            statement.setInt(3, productId);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Selling price updated successfully.");
                isUpdated = true;
            } else {
                System.out.println("Failed to update the selling price. No matching product found.");
            }
        }
    }
    return isUpdated;
}



    
}
