package chapter4.solid.basic.open.closed;

import java.util.List;

import chapter4.solid.basic.single.responsibility.model.Product;

public interface ProductCalculator {

	double calculate(List<Product> products);
}
