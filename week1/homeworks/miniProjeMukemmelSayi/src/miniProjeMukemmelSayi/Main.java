package miniProjeMukemmelSayi;
//https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
//"JAVA Dersleri-21"

public class Main {

	public static void main(String[] args) {
		int number=6;
		int total=0;
		
		for(int i=1 ;i<number ;i++) {
			
			if(number%i == 0) {
				total+=i;
			}
			
		}
		if(total == number) {
			System.out.println("Mükemmel sayıdır");
		}
		else {
			System.out.println("Mükemmel sayı değildir.");
		}

	}

}
