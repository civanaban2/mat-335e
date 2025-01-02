package Question3;

public class Test {
	public static void main(String[] args) {
		Person person = new Person("Ahmet");
		Car ahmetCar = new Car("34AHM34", FuelType.GASOLINE);
		Car car1 = new Car("34ABC34", FuelType.GASOLINE);
		Car car2 = new Car("34DEF34", FuelType.DIESEL);
		Car car3 = new Car("34GHI34", FuelType.GASOLINE);
		Car car4 = new Car("34JKL34", FuelType.DIESEL);

		System.out.println(person.introduceSelf());
		//Give Ahmet a car
		person.setCar(ahmetCar);
		System.out.println(person.introduceSelf());
		System.out.println(person.getCar().introduceSelf());
		System.out.println(person.getCar().calculateFuelCost(10));
		//Remove Ahmet's car
		person.setCar(null);
		System.out.println(person.introduceSelf());

		//Create a gallery and add cars
		Gallery gallery = new Gallery("Kardesler Oto Galeri", 10, person);
		System.out.println(gallery.introduceSelf());
		gallery.addCar(car1);
		System.out.println(gallery.introduceSelf());
		gallery.addCar(car2);
		gallery.addCar(car3);
		gallery.addCar(car4);
		gallery.addCar(car4);
		System.out.println(gallery.introduceSelf());

		//Search for cars and plates
		System.out.println("Search result for car1: ");
		//Search with object
		if (gallery.searchCar(car1) != false)
			System.out.println("Car with plate " + car1.getPlate() + " found in gallery.");
		else 
			System.out.println("Car with plate " + car1.getPlate() + " not found in gallery.");
		//Search with plate
		if (gallery.searchCar("34ABC34") != null)
			System.out.println("Car with plate " + car1.getPlate() + " found in gallery.");
		else 
			System.out.println("Car with plate " + car1.getPlate() + " not found in gallery.");

		//Search for a car that is not in the gallery
		System.out.println("Search result for a new car: ");
		//Search with object
		if (gallery.searchCar(new Car("34MNO34", FuelType.DIESEL)) != false)
			System.out.println("Car with plate " + car1.getPlate() + " found in gallery.");
		else 
			System.out.println("Car with plate " + car1.getPlate() + " not found in gallery.");
		//Search with plate
		if (gallery.searchCar("34MNO34") != null)
			System.out.println("Car with plate " + car1.getPlate() + " found in gallery.");
		else 
			System.out.println("Car with plate " + car1.getPlate() + " not found in gallery.");
	}
}
