package com.pgbezerra.services;

import com.pgbezerra.model.Product;

public abstract class ShippingService {

	protected Double shippingFee;
	protected ShippingService shippingService;
	
	public void setShippingSercice(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public abstract void calculateShippingFee(Product product);
	

}
