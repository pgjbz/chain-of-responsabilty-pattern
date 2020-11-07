package com.pgbezerra;

import com.pgbezerra.model.Product;
import com.pgbezerra.model.enums.Size;
import com.pgbezerra.services.LargeShippingService;
import com.pgbezerra.services.MediumShippingService;
import com.pgbezerra.services.ShippingService;
import com.pgbezerra.services.SmallShippingService;
import com.pgbezerra.services.UltraLargeShippingService;

public class App {

	public static void main(String ...args) {
		
		ShippingService largerService = new LargeShippingService();
		ShippingService mediumService = new MediumShippingService();
		ShippingService smallSerice = new SmallShippingService();
		ShippingService ultraLargeService = new UltraLargeShippingService();
		
		Product product = new Product("Filme - A volta dos que não foram", 10.0, Size.ULTRA_LARGE);
		
		
		largerService
		.addHandle(mediumService)
		.addHandle(ultraLargeService)
		.addHandle(smallSerice);
		
		largerService.calculateShippingFee(product);
		
	}

}
