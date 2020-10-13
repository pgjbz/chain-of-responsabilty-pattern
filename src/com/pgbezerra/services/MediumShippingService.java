package com.pgbezerra.services;

import com.pgbezerra.model.Product;
import com.pgbezerra.model.enums.Size;

public class MediumShippingService extends ShippingService {

	@Override
	public void calculateShippingFee(Product product) {
		if(product.getSize().equals(Size.MEDIUM)) {
			shippingFee = 60.0;
			System.out.println(String.format("[MEDIUM] Shipping fee is: %.2f for product %s", shippingFee, product));
		} else if(shippingService != null)
			shippingService.calculateShippingFee(product);
		else
			throw new IllegalArgumentException("No shipping service avaliable");
		
	}


}
