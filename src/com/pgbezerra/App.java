package com.pgbezerra;

import com.pgbezerra.model.Product;
import com.pgbezerra.model.enums.Size;
import com.pgbezerra.services.LargeShippingService;
import com.pgbezerra.services.MediumShippingService;
import com.pgbezerra.services.ShippingService;
import com.pgbezerra.services.SmallShippingService;

public class App {

	public static void main(String ...args) {
		
		ShippingService largerService = new LargeShippingService();
		ShippingService mediumService = new MediumShippingService();
		ShippingService smallSerice = new SmallShippingService();
		Product product = new Product("Filme - A volta dos que não foram", 10.0, Size.SMALL);
		
		
		largerService.setShippingSercice(mediumService);
		mediumService.setShippingSercice(smallSerice);
		
		largerService.calculateShippingFee(product);
		
	}

}
