package Lab10.Question1;

public class DrivingSchool {
	private String name;
	private double price;
	
	public DrivingSchool(String name, double price) {
		this.name = name;
		if (price < 0)
			throw new IllegalArgumentException("Price cannot be negative.");
		else
			this.price = price;
	}

	public boolean Register(int age) throws myException {
		if (age < 18)
			throw new myException("myException: You must be at least 18 years old to register.");
		else
			return true;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price < 0)
			throw new IllegalArgumentException("Price cannot be negative.");
		else
			this.price = price;
	}
}
