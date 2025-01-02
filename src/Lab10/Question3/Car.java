package Question3;

public class Car {
	private String plate;
	private FuelType fuelType;
	private Person owner;

	public Car(String plate, FuelType fuelType) {
		this.plate = plate;
		this.fuelType = fuelType;
	}
	
	public double calculateFuelCost(double liter) {
		return liter * fuelType.getPriceByLiter();
	}

	public String introduceSelf() {
		if (owner == null)
			return "Car with plate " + plate + " uses " + fuelType.getFuelName() + " fuel.";
		else
			return "Car with plate " + plate + " uses " + fuelType.getFuelName() + " fuel and is owned by " + owner.getName() + ".";
	}


	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
		if (owner != null && owner.getCar() != this) 
			owner.setCar(this);
	}
}
