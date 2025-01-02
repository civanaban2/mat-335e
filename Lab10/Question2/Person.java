package Lab10.Question2;

public class Person {
	private final String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void buyCandy() {
		System.out.println(getName() + " buys candy.");
	}

	public void buyCigarette() {
		System.out.println(getName() + " buys cigarette.");
	}

	public String getName() {
		return firstName + " " + lastName;
	}
}
