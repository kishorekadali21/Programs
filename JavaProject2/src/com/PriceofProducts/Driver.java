package com.PriceofProducts;

public class Driver {
	
	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		Product p = new Product();
		
		p.pid = 120;
		p.pname = "Keyboard";
		p.price = 500.00;
		
		d.print(p);
		
	}
	void print(Product p) {
		System.out.println(p.pid +"--"+ p.pname +"--"+ p.price);
	}

}
