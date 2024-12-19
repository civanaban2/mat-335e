package Lab9;

import java.util.Date;
@SuppressWarnings("deprecation")

public class TestQuestion1 {
	public static void main(String[] args) {
		MovieType type = MovieType.REGULAR;
		Movie movie = new Movie("The Matrix", "123456", type);
		System.out.printf("Daily price: %.2f\n", movie.getDailyPrice(35.07));

		try {
			Rental rental = new Rental(movie, new Date(124, 10, 1), new Date(124, 9, 1));
			System.out.println(rental.getMovie().getTitle() + " is rented.");
			System.out.println("Rental date: " + rental.getRentalDate() + "\nDue date: " + rental.getDueDate());
		} 
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
