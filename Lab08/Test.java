package Lab08;

public class Test {
	public static void main(String[] args) {
		Person person = new Person("Ahmet", 12345);
		Cat cat = new Cat("Cevdet");
		person.setCat(cat);
		person.introduceYourself();
	}
}
