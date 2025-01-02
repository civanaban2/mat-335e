package Lab10.Question2;

public class YoungAdult extends Person {
	public YoungAdult(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public void buyCigarette() {
		System.out.println(getName() + " buys cigarette.");
		System.out.println(getName() + " must stop smoke.");
	}
}
