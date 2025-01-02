package Lab09;

import java.util.Date;

public class Rental {
	private Movie movie;
	private Date rentalDate, dueDate;

	public Rental(Movie movie, Date rentalDate, Date dueDate) {
		this.movie = movie;
		
		if (rentalDate.after(dueDate))
			throw new IllegalArgumentException("Rental date cannot be after due date.");
		else {
			this.rentalDate = rentalDate;
			this.dueDate = dueDate;
		}
	}

	public Date getRentalDate() {
		return rentalDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public Movie getMovie() {
		return movie;
	}
}
