package Question2;

public class Kid extends Person {
	public Kid(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public void buyCigarette() {
		System.out.println(getName() + " cannot buy cigarette.");
	}
}
