package com.nit.beans;

public class Inventory {

	private int inventoryId;
	private int productId;
	private int quantity;
	private String warehouseLocation;

	public Inventory(int inventoryId, int productId, int quantity, String warehouseLocation) {

		this.inventoryId = inventoryId;
		this.productId = productId;
		this.quantity = quantity;
		this.warehouseLocation = warehouseLocation;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getWarehouseLocation() {
		return warehouseLocation;
	}

	public void setWarehouseLocation(String warehouseLocation) {
		this.warehouseLocation = warehouseLocation;
	}
}
