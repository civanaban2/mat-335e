package Final.Question1;

import java.sql.Date;
@SuppressWarnings("deprecation")

public class Test {
	public static void main(String[] args) {
		InternationalFlight flight = new InternationalFlight(123, "Madrid", new Date(125, 00, 28));
		InternationalFlight flight2 = new InternationalFlight(321, "Paris", new Date(125, 00, 24), "Delayed");

		System.out.println("Trying invalid date...\n");
		try {
			flight.delayFlight(new Date(125, 00, 25));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Flight1 Date: " + flight.getFlightDate());
		System.out.println("Flight1 Status: " + flight.getStatus());
		try {
			flight2.delayFlight(new Date(125, 00, 20));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Flight2 Date: " + flight2.getFlightDate());
		System.out.println("Flight2 Status: " + flight2.getStatus());

		System.out.println("\nTrying new date...\n");
		try {
			flight.delayFlight(new Date(125, 11, 5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Flight1 Date: " + flight.getFlightDate());
		System.out.println("Flight1 Status: " + flight.getStatus());
		try {
			flight2.delayFlight(new Date(125, 11, 5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Flight2 Date: " + flight2.getFlightDate());
		System.out.println("Flight2 Status: " + flight2.getStatus());
	}
}
