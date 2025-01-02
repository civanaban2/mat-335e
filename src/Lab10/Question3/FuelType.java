package Question3;

public enum FuelType {
	GASOLINE("Gasoline", 30),
	DIESEL("Diesel", 40);

	private String fuelName;
	private double priceByLiter;

	private FuelType(String fuelName, double priceByLiter) {
		this.fuelName = fuelName;
		this.priceByLiter = priceByLiter;
	}

	public String getFuelName() {
		return fuelName;
	}
	public double getPriceByLiter() {
		return priceByLiter;
	}
}
