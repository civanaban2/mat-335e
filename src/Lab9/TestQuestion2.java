package Lab9;

public class TestQuestion2 {
	public static void main(String[] args) {
		DrivingSchool school;
		try {
			school = new DrivingSchool("CRA Driving School", 1000.0);
			System.out.println("School name: " + school.getName());
			System.out.println("Price: " + school.getPrice());
			System.out.println("Registering a 17-year-old student...");
			school.Register(19);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
