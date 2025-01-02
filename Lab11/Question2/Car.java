package Lab11.Question2;

public class Car implements CommercialVehicle, PersonalVehicle{
	private int modelYear;
	private double engineVolume;

	public Car(int modelYear, double engineVolume) {
		this.modelYear = modelYear;
		this.engineVolume = engineVolume;
	}

	@Override
	public double calculateTax(double baseTax) {
		return baseTax * engineVolume;
	}

	@Override
	public double calculateAmortizedTax(double baseTax, int currentYear) {
		if (modelYear - currentYear > 9) {
			return baseTax * engineVolume * (1 - 0.9);
		}
		else 
			return baseTax * engineVolume * (1 - (modelYear - currentYear) * 0.1);
	}

	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public double getEngineVolume() {
		return engineVolume;
	}
	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}
}
