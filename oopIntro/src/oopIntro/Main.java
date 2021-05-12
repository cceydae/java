package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V14", 15000, "16 GB Ram"); //referans oluþturma,intance
		
		Product product2 = new Product(); 
		product2.id = 1;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";
		
		Product product3 = new Product();
		product3.id = 1;
		product3.name = "Hp 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		
		
		Category category1 = new Category();
		category1.id= 1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id= 2;
		category2.name="Ev/Bahçe";
		
		Category[] categorys = {category1, category2};
		
		System.out.println(categorys.length);
		
		for (Category category : categorys) {
			System.out.println(category.name);
		}
		
		
		ProductManager productManager = new ProductManager();
		productManager.addtoCart(product1);
		productManager.addtoCart(product2);
		productManager.addtoCart(product3);
	}

}
