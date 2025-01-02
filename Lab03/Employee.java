package Lab03;

@SuppressWarnings("unused")
public class Employee {
	
	private String essn;
	private double pricebyHour;
	private int workingYear;
	private boolean isRetired;

	public Employee (String essn, int workingYear, double pricebyHour, boolean isRetired) {
		this.essn = essn;
		setWorkingYear(workingYear);
		this.pricebyHour = pricebyHour;
		setIsRetired(isRetired);
	}

	public int getWorkingYear() {
		return workingYear;
	}

	public boolean getIsRetired() {
		return isRetired;
	}

	public void setIsRetired(boolean isRetired) {
		this.isRetired = isRetired;
	}

	public void setWorkingYear(int workingYear) {
		this.workingYear = workingYear;
		Retiring();
	}

	public boolean deserveBonus() {
		if (workingYear >= 10 && !isRetired) {
			return true;
		}
		else
			return false;	
	}

	public double calculateSalary(int workingHour, int workingDays) {
		double salary = workingHour * workingDays * pricebyHour;
		return salary;
	}

	public void Retiring() {
		if (workingYear >= 20) {
			setIsRetired(true);
		}
	}
}
