package com.sub.day38;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("operation")
public class OperationDao {

    private JdbcTemplate template;

    // Get price by product name
    private static final String SQL_QUERY_FOR_GETPRODUCTPRICE =
            "SELECT price FROM ProductDetail WHERE productName=?";

    // Get all products
    private static final String SQL_QUERY_FOR_GETALLPRODUCT =
            "SELECT * FROM ProductDetail";

    // Insert product
    private static final String SQL_QUERY_FOR_INSERTPRODUCT =
            "INSERT INTO ProductDetail "
            + "(productName, shippingAdd, price, quantity, placeDate) "
            + "VALUES (?, ?, ?, ?, ?)";

    // Delete product
    private static final String SQL_QUERY_FOR_DELETEPRODUCT =
            "DELETE FROM ProductDetail WHERE productName=?";

    // Update product
    private static final String SQL_QUERY_FOR_UPDATEPRODUCT =
            "UPDATE ProductDetail "
            + "SET shippingAdd=?, placeDate=? "
            + "WHERE productName=?";

    @Autowired
    public OperationDao(JdbcTemplate template) {
        this.template = template;
    }

    // =====================================================
    // 1. GET PRODUCT PRICE
    // =====================================================

    public Float getProductPrice(String name) {

        List<Float> prices = template.query(
                SQL_QUERY_FOR_GETPRODUCTPRICE,
                (rs, rowNum) -> rs.getFloat("price"),
                name
        );

        if (prices.isEmpty()) {
            return null;
        }

        // If multiple products have same name,
        // return the first matching price.
        return prices.get(0);
    }

    // =====================================================
    // 2. GET ALL PRODUCTS
    // =====================================================

    public List<ProductDelivery> getAllProduct() {

        return template.query(
                SQL_QUERY_FOR_GETALLPRODUCT,
                (rs, rowNum) -> {

                    ProductDelivery product =
                            new ProductDelivery();

                    product.setProductName(
                            rs.getString("productName")
                    );

                    product.setProductShippingAddress(
                            rs.getString("shippingAdd")
                    );

                    product.setProductPrice(
                            rs.getFloat("price")
                    );

                    product.setProductQuantity(
                            rs.getInt("quantity")
                    );

                    product.setProductPlaceDate(
                            rs.getDate("placeDate")
                    );

                    return product;
                }
        );
    }

    // =====================================================
    // 3. INSERT PRODUCT
    // =====================================================

    public int insertProduct(ProductDelivery product) {

        return template.update(
                SQL_QUERY_FOR_INSERTPRODUCT,
                product.getProductName(),
                product.getProductShippingAddress(),
                product.getProductPrice(),
                product.getProductQuantity(),
                product.getProductPlaceDate()
        );
    }

    // =====================================================
    // 4. DELETE PRODUCT
    // =====================================================

    public int deleteProduct(String name) {

        return template.update(
                SQL_QUERY_FOR_DELETEPRODUCT,
                name
        );
    }

    // =====================================================
    // 5. UPDATE PRODUCT
    // =====================================================

    public int updateProduct(
            String address,
            Date date,
            String name) {

        return template.update(
                SQL_QUERY_FOR_UPDATEPRODUCT,
                address,
                date,
                name
        );
    }
}
