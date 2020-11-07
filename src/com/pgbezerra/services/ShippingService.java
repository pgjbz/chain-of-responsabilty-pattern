package com.pgbezerra.services;

import java.util.Objects;

import com.pgbezerra.model.Product;

public abstract class ShippingService {

	protected Double shippingFee;
	protected ShippingService shippingService;
	
	public ShippingService addHandle(ShippingService shippingService) {
		if(Objects.isNull(this.shippingService)) {
			this.shippingService = shippingService;
			return this.shippingService;
		}
		return this.shippingService.addHandle(shippingService);
	}
	
	public abstract void calculateShippingFee(Product product);
	

}
