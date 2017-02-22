package com.packt.webstore.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.packt.webstore.domain.Product;

@Component
public class ProductImageValidator implements Validator {
	public boolean supports(Class<?> clazz) {
		return Product.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Product product = (Product) target;
		long allowedSize = product.getProductImage().getSize();
		if (allowedSize >= 120000 || product.getProductImage().isEmpty()) {
			errors.rejectValue("productImage", "com.packt.webstore.validator.ProductImageValidator.message");
		}
	}
}