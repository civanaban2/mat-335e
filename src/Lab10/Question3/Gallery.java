package Question3;

public class Gallery {
	private String galleryName;
	private Car[] cars;
	private int carCount;
	private int capacity;
	private Person galleryOwner;

	public Gallery(String name, int capacity, Person owner) {
		this.galleryName = name;
		this.capacity = capacity;
		this.galleryOwner = owner;
		cars = new Car[capacity];
		carCount = 0;
	}

	public boolean addCar(Car car) {
		if (carCount < capacity && !searchCar(car)) {
			cars[carCount] = car;
			carCount++;
			System.out.println("Car with plate " + car.getPlate() + " added to gallery.");
			return true;
		}
		else if (searchCar(car)) {
			System.out.println("Car with plate " + car.getPlate() + " already exists in gallery.");
			return false;
		}
		else
			return false;
	}

	public boolean searchCar(Car car) {
		for (int i = 0; i < carCount; i++) {
			if (cars[i].getPlate().equals(car.getPlate())) {
				return true;
			}
		}
		return false;
	}

	public Car searchCar(String plate) {
		for (int i = 0; i < carCount; i++) {
			if (cars[i].getPlate().equals(plate)) {
				return cars[i];
			}
		}
		return null;
	}

	public String introduceSelf() {
		if (galleryOwner == null)
			return "Gallery " + galleryName + " has " + carCount + " cars.";
		else
			return "Gallery " + galleryName + " owned by " + galleryOwner.getName() + " has " + carCount + " cars.";
	}

	public String getGalleryName() {
		return galleryName;
	}
	public void setGalleryName(String galleryName) {
		this.galleryName = galleryName;
	}
	public Person getGalleryOwner() {
		return galleryOwner;
	}
	public void setGalleryOwner(Person galleryOwner) {
		this.galleryOwner = galleryOwner;
	}
}
