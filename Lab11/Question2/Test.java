package Lab11.Question2;

public class Test {
	public static void main(String[] args) {
		PersonalVehicle		car1 = new Car(2010, 2.0);
		CommercialVehicle	car2 = new Car(2020, 3.0);
		Car 				car3 = new Car(2015, 4.0);
		CommercialVehicle	bus = new Bus(2015, 10);

		System.out.println("Car1 tax: " + car1.calculateTax(1000));
		System.out.println("Car2 tax: " + car2.calculateAmortizedTax(1000, 2025));
		System.out.println("Car2 tax: " + car3.calculateTax(1000));
		System.out.println("Car2 tax: " + car3.calculateAmortizedTax(1000, 2025));
		System.out.println("Bus tax: " + bus.calculateAmortizedTax(1000, 2025));
	}
}
