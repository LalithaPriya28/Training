package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
	String productName;
	String model;
	int price;
	
	public Product(String productName, String model, int price) {
		super();
		this.productName = productName;
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", model=" + model + ", price=" + price + "]";
	}
	
	class PriceComparator implements Comparator<Product>{

		@Override
		public int compare(Product o1, Product o2) {
			if(o1.price==o2.price)
				return 0;
			else if(o1.price>o2.price)
				return 1;
			return -1;
		}
		
	}
	class NameComparator implements Comparator<Product>
	{

		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			return o1.productName.compareTo(o2.productName);
		}
		
	}
	
	

}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> pro=new ArrayList<Product>();
		pro.add(new Product("HP","Touch",70000));
		pro.add(new Product("Lenovo","ThinkPad",30000));
		pro.add(new Product("Dell","Touch",60000));
		System.out.println(pro);
		
		for(Product p: pro) {
			System.out.println(p.productName+" "+p.model+" "+p.price);
		}
		System.out.println("........Sorting by price.......");
		//Collections.sort(pro,new PriceComparator());
		for(Product p: pro) {
			System.out.println(p.productName+" "+p.model+" "+p.price);
		}
		System.out.println(".........Sorting by name.........");
		//Collections.sort(pro,new NameComparator());
		for(Product p: pro) {
			System.out.println(p.productName+" "+p.model+" "+p.price);
		}
		
		
		
		
		

	}

	

}
