package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryDAO {

	@Autowired
	private JdbcTemplate template;

	public void saveInventory(Inventory inventory) {

		String query = "INSERT INTO inventory VALUES(?,?,?,?)";

		template.update(query, inventory.getInventoryId(), inventory.getProductId(), inventory.getQuantity(),
				inventory.getWarehouseLocation());
	}
}
