package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entitites.Product;

public class Program {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//percorrer uma lista de produtos aumentando o valor em 10%
		
		//opção 1 - classe implementado Consumer
		//list.forEach(new PriceUpdate());
		

		//opção 2 - metodo estático
		//list.forEach(Product::staticPriceUpdate);
		
		// opção 3 - método não estático
		//list.forEach(Product::nonStaticPriceUpdate);
		
		//opção 4 - expressão lambda declarada
		double factor = 1.1;
		//Consumer<Product> cons = p -> {
			//p.setPrice(p.getPrice() * factor);
		//};
		list.forEach(p -> p.setPrice(p.getPrice()*factor));
		list.forEach(System.out::println);
	}

}
