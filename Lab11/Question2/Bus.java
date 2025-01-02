package Lab11.Question2;

public class Bus implements CommercialVehicle {
	private int modelYear;
	private double tonnage;

	public Bus(int modelYear, double tonnage) {
		this.modelYear = modelYear;
		this.tonnage = tonnage;
	}

	@Override
	public double calculateAmortizedTax(double baseTax, int currentYear) {
		double tonnageRate;
		double ageRate = (currentYear - modelYear) * 0.05;

		if (ageRate > 2) 
			ageRate = 2;
		if (tonnage < 1)
			tonnageRate = 1;
		else if (tonnage >= 1 && tonnage <= 10)
			tonnageRate = 1.4;
		else
			tonnageRate = 1.6;

		return baseTax * tonnageRate * ageRate;
	}

	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public double getTonnage() {
		return tonnage;
	}
	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}
}
