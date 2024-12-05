package Lab8;

public class Aquarium {
	private int numberFish;

	public Aquarium(int numberFish) {
		this.numberFish = numberFish;
	}

	public void addFish() {
		this.numberFish++;
	}

	public boolean removeFish(int number) {
		if (number > this.numberFish)
			return false;
		this.numberFish -= number;
		return true;
	}

	public boolean removeFish() {
		if (this.numberFish == 0)
			return false;
		this.numberFish--;
		return true;
	}

	public int getNumberFish() {
		return numberFish;
	}
	public void setNumberFish(int numberFish) {
		this.numberFish = numberFish;
	}
}
