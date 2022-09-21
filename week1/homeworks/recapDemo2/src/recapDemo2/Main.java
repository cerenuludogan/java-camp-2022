package recapDemo2;
//https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
//"JAVA Dersleri-15"

public class Main {
	public static void main(String[] args) {
		
	    double[] myList = {1.2,1.3,4.3,5.6};
		
		double total = 0;
		double max = myList[0];
		
		for(double number:myList) {
			
			if(number>max) {
				max = number;
			}
			
			total += number;
			System.out.println(number);
		}
		
		System.out.println("toplam: "+total);
		System.out.println("max: "+max);
	

	}
}
