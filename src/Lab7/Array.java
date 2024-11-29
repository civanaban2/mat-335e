package Lab7;

public class Array {
	public static void main(String[] args) {
		String[] a1 = {"star", "pie", "jelly bean", "car"};
		String[] a2 = {"cookie", "fig", "banana", "soda"};
		String[] a3 = longArray(a1, a2);

		//a3 un elemanlarini tek tek ekrana yazdiriyoruz
		for (String string : a3) {
			System.out.printf("\"%s\" ", string);
		}
		System.out.println("");

		String[] a4 = {"Splinter", "Leo", "April", "Don", "Raph"};
		String[] a5 = {"Krang", "Shredder", "Bebop"};
		String[] a6 = longArray(a4, a5);

		//a6 nin elemanlarini tek tek ekrana yazdiriyoruz
		for (String string : a6) {
			System.out.printf("\"%s\" ", string);
		}
		System.out.println("");
	}

	public static String[] longArray(String[] a1, String[] a2) {
		//a3 arrayini daha buyuk olan parametreye gore olusturuyoruz.
		String[] a3 = new String[ (a1.length >= a2.length) ? a1.length : a2.length ];
		int idx = 0;

		while (idx < a3.length)
		{
			//Hala iki arrayin de icinde oldugumuz surece karsilastirma yapiyoruz.
			if (idx < a1.length && idx < a2.length)
			{
				//"a[idx]" bir string oldugu icin length() metodunu kullanmaliyiz
				//Eger array olsaydı sadece .length yazmamiz yeterli olurdu cünkü .length bir array ozelligi
				if (a1[idx].length() >= a2[idx].length())
					a3[idx] = a1[idx];
				else
					a3[idx] = a2[idx];
			}
			//Eger en az 1 tane arrayin sonuna geldiysek artik "oops" bastiriyoruz.
			else
				a3[idx] = "oops";
			idx++;
		}
		return a3;
	}
}
