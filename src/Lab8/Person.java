package Lab8;

public class Person {
	private String name;
	private String tcNo;
	private Aquarium aquarium;
	private Cat cat;

	public Person(String name, int tcNo) {
		this.name = name;
		this.tcNo = Integer.toString(tcNo);
	}

	public void introduceYourself() {
		if (cat != null && aquarium != null)
			System.out.printf("My name is %s and my cat is %s and I have %d fish.", getName(), cat.getName(), aquarium.getNumberFish());
		else if (cat != null && aquarium == null)
			System.out.printf("My name is %s and my cat is %s.", getName(), cat.getName());
		else if (cat == null && aquarium != null)
			System.out.printf("My name is %s and I have %d fish.", getName(), aquarium.getNumberFish());
		else
			System.out.printf("My name is %s and I don't have any pets.", getName());
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTcNo() {
		return tcNo;
	}
	
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
}
