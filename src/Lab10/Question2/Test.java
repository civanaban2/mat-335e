package Question2;

public class Test {
	public static void main(String[] args) {
		Kid kid = new Kid("Civan Rumet", "Ari");
		YoungAdult youngAdult = new YoungAdult("Ahmet", "Topal");
		Adult adult = new Adult("Burcu", "Tunga");
		
		kid.buyCandy();
		kid.buyCigarette();

		youngAdult.buyCandy();
		youngAdult.buyCigarette();

		adult.buyCandy();
		adult.buyCigarette();
	}
}
