package methods2;
//https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
//"JAVA Dersleri-25"

public class Main {

	public static void main(String[] args) {
		String message = "Bugun hava cok guzel";
		String newMessage = addCity();
		System.out.println(newMessage);
		int sayi = sum(5,7);
		System.out.println(sayi);
		 System.out.println(sum2(1,2,3,4,5,6,7,8,9,10));

	}
	public static void add(){
		System.out.println("Eklendi");
	}
	public static void delete(){
		System.out.println("Silindi");
	}
    public static void update(){
    	System.out.println("Güncellendi");
	}

    public static int sum(int sayi1,int sayi2) {
    	return sayi1 + sayi2;
 
    }
    public static int sum2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
    public static String addCity() {
    	return "İzmir";
    }
}
