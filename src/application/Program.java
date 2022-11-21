package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// Resolução por Nelio Alves (resolvendo conforme ele resolve no curso para eu entender o codigo)
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scan.nextLine();
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println(product);
		
		scan.close();

	}

}
