package Lab3;

public class TestClip {
	public static void main(String[] args) {
		Clip myClip = new Clip(10, 5);
		myClip.firing();
		myClip.firing();
		myClip.firing();
		myClip.firing();
		System.out.println("Current number of bullets: " + myClip.getCurrentNumber());
		myClip.filling();
		System.out.println("Current number of bullets: " + myClip.getCurrentNumber());

	}
}