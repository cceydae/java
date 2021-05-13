package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer ceyda = new IndividualCustomer();
		ceyda.customerNumber="12345";
		
		CorporateCustomer hepsiBurada =new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(ceyda);
		//customerManager.add(abc);
		
		Customer[] customers = {ceyda,hepsiBurada,abc};
		customerManager.addMultiple(customers);
		
		
		
		
		
		
	}

}
