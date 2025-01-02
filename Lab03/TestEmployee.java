package Lab03;

public class TestEmployee {
	public static void main(String[] args) {
		Employee eleman = new Employee("12345678901", 14, 15.5, false);
		System.out.println("Deserved bonus: " + eleman.deserveBonus());
		System.out.println("Salary: " + eleman.calculateSalary(8, 20));
		eleman.setWorkingYear(21);
		System.out.println("Is retired: " + eleman.getIsRetired());
	}
}
