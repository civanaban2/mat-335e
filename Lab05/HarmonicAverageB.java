package Lab05;

import java.util.Scanner;

public class HarmonicAverageB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number;
		int n = 0;
		double sum = 0;

		while ((number = scanner.nextDouble()) > 0) {
			sum += 1 / number;
			n++;
		}
		System.out.println(n / sum);
		scanner.close();
	}
}
