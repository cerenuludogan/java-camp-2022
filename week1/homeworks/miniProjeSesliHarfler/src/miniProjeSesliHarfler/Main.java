package miniProjeSesliHarfler;

//https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
//"JAVA Dersleri-20"

public class Main {

	public static void main(String[] args) {
	
		char harf = 'A';
		
		switch (harf) {
		 case 'A':
		 case 'I':
		 case 'O':
		 case 'U':
			 System.out.println("Kalın sesli harf");
			 break;
			 default:
				 System.out.println("İnce sesli harf");
			
		}

	}

}

