package oopIntro;

public class Product {
	
	
//constructor-yazmasak da var, çalýþýrken olmasýný istediðin þeyi yazýyorsun 
	public Product() { 
		System.out.println("Ben çalýþtým");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this(); //ben çalýþtým yazýsý product1 için
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}  //product1 için
	
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
