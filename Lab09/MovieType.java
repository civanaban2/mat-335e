package Lab09;

public enum MovieType {
	REGULAR(1.5),
	NEW_RELEASE(2.0),
	CHILDRENS(1.0);

	private double rentalPrice;

	private MovieType(double rentalPrice)
	{
		this.rentalPrice = rentalPrice;
	}

	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
