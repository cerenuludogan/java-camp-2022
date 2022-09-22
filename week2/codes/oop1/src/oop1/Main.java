package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsIntStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(6500);
		product2.setUnitsIntStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(4500);
		product3.setUnitsIntStock(3);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());

		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0254556");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Ceren");
		individualCustomer.setLastName("Uludoğan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0524556");
		corporateCustomer.setTaxNumber("012234567");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customer = {individualCustomer,corporateCustomer};
		
	}

}
