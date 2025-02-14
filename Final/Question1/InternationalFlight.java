package Final.Question1;

import java.util.Date;

public class InternationalFlight extends Flight {
 
	public InternationalFlight(int flightNumber, String destination, Date flightDate) {
		super(flightNumber, destination, flightDate);
	}

	//Polymorphism example, actually not suitable for question subjective but I wanted to show it for polymorphism.
	public InternationalFlight(int flightNumber, String destination, Date flightDate, String status) {
		super(flightNumber, destination, flightDate);
		super.setStatus(status);
	}

	@Override
	public void delayFlight(Date date) throws IllegalArgumentException {
		if (date.after(super.getFlightDate())) {
			setFlightDate(date);
			setStatus("Delayed");
		}
		else {
			throw new IllegalArgumentException("Flights cannot be delayed to a previous date before flight date.");
		}
	}

}
