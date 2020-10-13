package com.pgbezerra.services;

import com.pgbezerra.model.Product;
import com.pgbezerra.model.enums.Size;

public class LargeShippingService extends ShippingService {

	@Override
	public void calculateShippingFee(Product product) {
		
		if(product.getSize().equals(Size.LARGE)) {
			shippingFee = 120.0;
			System.out.println(String.format("[LARGE] Shipping fee is: %.2f for product %s", shippingFee, product));
		} else if(shippingService != null) 
			shippingService.calculateShippingFee(product);
		else
			throw new IllegalArgumentException("No shipping service avaliable");
		

	}

}
