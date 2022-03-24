package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the number of Products:");
		int n = sc.nextInt();

		
		for(int i=0; i<n; i++) {
			System.out.println("Product " + i + " Data:");
			System.out.println("Common, used or imported (c/u/i");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if(ch == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				list.add(new Product(name, price));
				
			}else if (ch == 'u') {
				
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufacture = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufacture));
				
			} else if (ch == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("CustomFee: ");
				Double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));	
			}
			
		}
		
		for (Product c : list) {
			System.out.println(c);
		}

	}

}
