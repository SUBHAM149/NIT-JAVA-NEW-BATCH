package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Autowired
	private JdbcTemplate template;

	public void saveProduct(Product product) {

		String query = "INSERT INTO product VALUES(?,?,?,?)";

		template.update(query, product.getProductId(), product.getProductName(), product.getCategory(),
				product.getPrice());
	}
}
