package interfaces;

public class Main {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}

/*      interfaceler
Bir sınıf birden fazla interface'i implemente edebilir.
Kalıtım olaylarında böyle bir durum yoktur.
interfaceler ve abstractlar new'lenemezler 
*/
