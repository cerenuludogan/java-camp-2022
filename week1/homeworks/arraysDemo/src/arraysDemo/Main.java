package arraysDemo;
//https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
//"JAVA Dersleri-14"

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		
		String[] ogrenciler = new String[3];
		System.out.println("----------------------");
		
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		
		for(int i = 0 ;i<ogrenciler.length ;i++) {
			System.err.println(ogrenciler[i]);
		}
		System.out.println("----------------------");
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
	

	}

}
