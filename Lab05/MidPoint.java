package Lab05;

public class MidPoint {
	public static void main(String[] args) {
		System.out.println(hasMidpoint(4, 6, 8));
		System.out.println(hasMidpoint(8, 8, 8));
		System.out.println(hasMidpoint(25, -5, 10));
		System.out.println(hasMidpoint(3, 1, 3));
		System.out.println(hasMidpoint(21, 9, 58));
		System.out.println(hasMidpoint(1, 2, 1));
	}

	public static boolean hasMidpoint(double a, double b, double c) {
		if (a + b == 2 * c)
			return true;
		else if (a + c == 2 * b)
			return true;
		else if (b + c == 2 * a)
			return true;
		else
			return false;
	}
}
