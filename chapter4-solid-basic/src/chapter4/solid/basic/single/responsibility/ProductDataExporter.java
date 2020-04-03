package chapter4.solid.basic.single.responsibility;

import chapter4.solid.basic.single.responsibility.model.Product;

public interface ProductDataExporter <T extends Product> {

	String export(T product);
	
}
