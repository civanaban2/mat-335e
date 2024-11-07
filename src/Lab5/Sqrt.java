package Lab5;

import java.util.Scanner;
public class Sqrt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number;
		double X;

		System.out.println("Enter a number: ");
		number = scanner.nextDouble();
		System.out.println("Enter a initial point: ");
		X = scanner.nextDouble();

		System.out.println("Result: " + iterativeSqrt(number, X));
		scanner.close();
	}

	public static double iterativeSqrt(double number, double X) {
		Scanner scanner = new Scanner(System.in);
		double Xnext = X;

		do {
			X = Xnext;
			Xnext = (X + number / X) / 2;
		} while (Math.abs(Xnext - X) >= 10e-5);
		scanner.close();
		return Xnext;
	}
		
}
