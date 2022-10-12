package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {       /* Eğer hiçbir yerde override edilmesini istemiyorsak  final anahtar kelimesini kullanırız*/
		return tutar * 1.18;                         
	}
}
