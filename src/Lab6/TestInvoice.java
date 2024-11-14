package Lab6;

public class TestInvoice {
	public static void main(String[] args) {
		Invoice urun1 = new Invoice("123456", "Klavye", 15, -39.99);
		Invoice urun2 = new Invoice("567890", "Mouse", 10, 29.99);

		System.out.println("Invoice amount of first product is: " + urun1.invoiceAmount());
		System.out.println("Invoice amount of first product is: " + urun2.invoiceAmount());
	}
}
