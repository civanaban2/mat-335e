package Final.Question1;

import java.util.Date;

public abstract class Flight {
	private int flightNumber;
	private String destination;
	private Date flightDate;
	private String status;

	public Flight(int flightNumber, String destination, Date flightDate) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.flightDate = flightDate;
		this.status = "Scheduled";
	}

	public abstract void delayFlight(Date date) throws IllegalArgumentException;

	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
