package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private InventoryDAO inventoryDAO;

	@Transactional
	public void saveProductAndInventory(Product product, Inventory inventory) {

		productDAO.saveProduct(product);

		inventoryDAO.saveInventory(inventory);

		System.out.println("Product And Inventory Saved Successfully");
	}
}
