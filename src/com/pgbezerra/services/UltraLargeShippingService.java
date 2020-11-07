package com.pgbezerra.services;

import com.pgbezerra.model.Product;
import com.pgbezerra.model.enums.Size;

public class UltraLargeShippingService extends ShippingService {

	@Override
	public void calculateShippingFee(Product product) {
		
		if(product.getSize().equals(Size.ULTRA_LARGE)) {
			shippingFee = 120.0;
			System.out.println(String.format("[ULTRA LARGE] Shipping fee is: %.2f for product %s", shippingFee, product));
		} else if(shippingService != null) 
			shippingService.calculateShippingFee(product);
		else
			throw new IllegalArgumentException("No shipping service avaliable");
		

	}

}
