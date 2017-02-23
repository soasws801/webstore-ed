package com.packt.webstore.service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface ProductService {

	List<Product> getAllProducts();

	List<Product> getProductsByCategory(String category);

	List<Product> getProductsByManufacturer(String manufacturer);

	List<Product> getProductsByPriceFilter(BigDecimal low, BigDecimal high);

	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	Product getProductById(String productId);

	Set<Product> filterProducts(BigDecimal lowPrice, BigDecimal highPrice,
			String manufacturer, String category);
	
	void addProduct(Product product);
}
