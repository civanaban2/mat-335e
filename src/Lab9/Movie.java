package Lab9;

public class Movie {
	private String title, barcode;
	private MovieType type;

	public Movie(String title, String barcode, MovieType type) {
		this.title = title;
		this.barcode = barcode;
		this.type = type;
	}

	public MovieType getType() {
		return type;
	}
	public String getTitle() {
		return title;
	}
	public String getBarcode() {
		return barcode;
	}
	public double getDailyPrice(double exchangeRate)
	{
		return type.getRentalPrice() * exchangeRate;
	}
}
