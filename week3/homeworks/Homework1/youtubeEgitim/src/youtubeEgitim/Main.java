package youtubeEgitim;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		
		Customer customer =  new Customer();
		customer.setId(1);
		customer.setCity("İstanbul");
		
		
		
		Company company = new Company();
		company.setTaxNumber("2000");
		company.setCompanyName("Arcelik");
		company.setId(100);
		
		CustomerManager customerManager2 = new CustomerManager(new Customer(),new MilitaryCreditManager());
		customerManager2.giveCredit();
		
	
		
		
		Person person = new Person();
		person.setNationalIdentity("100");
		person.setFirstName("Engin");
		}
	
	

}
