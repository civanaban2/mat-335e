package Lab3;

public class Clip {
	private int capacity;
	private int currentNumber;
	
	public Clip(int capacity, int currentNumber) {
		this.capacity = capacity;
		this.currentNumber = currentNumber;
	}

	public boolean firing() {
		if (currentNumber > 0) {
			currentNumber--;
			return true;
		}
		else
			return false;
	}

	public void filling(){
		this.currentNumber = capacity;
	}

	public int getCurrentNumber() {
		return currentNumber;
	}
}