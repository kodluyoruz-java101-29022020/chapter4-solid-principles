package chapter4.solid.basic.open.closed;

import java.util.List;

import chapter4.solid.basic.single.responsibility.model.Product;

public class ProductPriceCalculator implements ProductCalculator {

	@Override
	public double calculate(List<Product> products) {
		
		double totalPrice = 0;
		
		for(Product product : products) {
			
			totalPrice += product.getPrice();
		}
		
		return totalPrice;
	}
	
}
