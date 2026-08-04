package com.sub.nit.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.product.entity.Product;
import com.sub.nit.product.response.ApiResponse;
import com.sub.nit.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	// Save Product
	@PostMapping("/save")
	public ResponseEntity<ApiResponse> saveProduct(@RequestBody Product product) {

		Product savedProduct = service.saveProduct(product);

		ApiResponse response = new ApiResponse(
				HttpStatus.CREATED.value(),
				"Product Saved Successfully",
				savedProduct);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	// Get All Products
	@GetMapping("/all")
	public ResponseEntity<ApiResponse> getAllProducts() {

		ApiResponse response = new ApiResponse(
				HttpStatus.OK.value(),
				"Products Retrieved Successfully",
				service.getAllProducts());

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	// Get Product By Id
	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse> getProductById(@PathVariable Integer id) {

		Product product = service.getProductById(id);

		ApiResponse response = new ApiResponse(
				HttpStatus.OK.value(),
				"Product Found Successfully",
				product);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	// Update Product
	@PutMapping("/update/{id}")
	public ResponseEntity<ApiResponse> updateProduct(@PathVariable Integer id,
			@RequestBody Product product) {

		Product updatedProduct = service.updateProduct(id, product);

		ApiResponse response = new ApiResponse(
				HttpStatus.OK.value(),
				"Product Updated Successfully",
				updatedProduct);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	// Delete Product
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ApiResponse> deleteProductById(@PathVariable Integer id) {

		String message = service.deleteProductById(id);

		ApiResponse response = new ApiResponse(
				HttpStatus.OK.value(),
				message,
				null);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
