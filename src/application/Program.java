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
		
		//op��o 1 - classe implementado Consumer
		//list.forEach(new PriceUpdate());
		

		//op��o 2 - metodo est�tico
		//list.forEach(Product::staticPriceUpdate);
		
		// op��o 3 - m�todo n�o est�tico
		//list.forEach(Product::nonStaticPriceUpdate);
		
		//op��o 4 - express�o lambda declarada
		double factor = 1.1;
		//Consumer<Product> cons = p -> {
			//p.setPrice(p.getPrice() * factor);
		//};
		list.forEach(p -> p.setPrice(p.getPrice()*factor));
		list.forEach(System.out::println);
	}

}
