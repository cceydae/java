package oopIntro;

public class Product {
	
	
//constructor-yazmasak da var, �al���rken olmas�n� istedi�in �eyi yaz�yorsun 
	public Product() { 
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this(); //ben �al��t�m yaz�s� product1 i�in
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}  //product1 i�in
	
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
