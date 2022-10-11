package youtubeEgitim;

public class CustomerManager extends Customer {
	
	private Customer customer;
	private ICreditManager creditManager;
	
	
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		super();
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Musteri kaydedildi: " + customer);
	}
	public void delete() {
		System.out.println("Musteri silindi: " + customer );
		
	}
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
		
	}

}
