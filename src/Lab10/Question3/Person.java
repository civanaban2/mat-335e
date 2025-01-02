package Question3;

public class Person {
	private String name;
	private Car car;

	public Person(String name) {
		this.name = name;
	}

	public String introduceSelf() {
		if (car == null)
			return "I am " + name + " and I don't have a car.";
		else
			return "I am " + name + " and car with plate " + car.getPlate() + " is mine.";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
		if (car != null && car.getOwner() != this)
			car.setOwner(this);
	}
}
