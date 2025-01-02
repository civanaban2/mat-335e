package Question1;

public class TestQuestion2 {
	public static void main(String[] args) {
		DrivingSchool school;
		try {
			school = new DrivingSchool("CRA Driving School", 1000);
			System.out.println("School name: " + school.getName());
			System.out.println("Price: " + school.getPrice());
			System.out.println("Registering age of a student.");
			school.Register(17);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		catch (myException e) {
			System.out.println(e.getMessage());
		}
	}
}
