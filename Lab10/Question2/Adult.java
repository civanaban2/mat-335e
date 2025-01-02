package Lab10.Question2;

public class Adult extends Person{
	public Adult(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public void buyCandy() {
		System.out.println(getName() + " buys candy.");
		System.out.println(getName() + " must be careful about getting fat.");
	}
}
