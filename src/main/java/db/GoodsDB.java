package db;

import entities.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GoodsDB {

    private Connection connection = DBConnector.getConnection();

    public List<Product> getAllGoods() {
        List<Product> goods = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM goods";
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                Integer id = rs.getInt("id");
                Integer categoryId = rs.getInt("category_id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                Integer quantity = rs.getInt("quantity");
                Integer measurementUnitId = rs.getInt("measurement_unit_id");

                goods.add(new Product(id, categoryId, name, price, quantity, measurementUnitId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return goods;
    }

    public void insertProduct(Product product){
        try {
            String sql = "INSERT INTO goods VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setInt(2, product.getCategoryId());
            preparedStatement.setString(3, product.getName());
            preparedStatement.setDouble(4, product.getPrice());
            preparedStatement.setInt(5, product.getQuantity());
            preparedStatement.setInt(6, product.getMeasurementUnitId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }



        }

}
