package abstractClasses;

public class Main {
	public static void main(String[] args) {
		
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		womenGameCalculator.hesapla();
		
		GameCalculator gameCalculator = new WomenGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
		
	}

}
