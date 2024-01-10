package com.seed.binding;

import lombok.Data;

@Data
public class Product {
	private Integer productId;
	private String productName;
	private double productprize;
	public Integer getProductId() {
		return productId;
	}
	
}
