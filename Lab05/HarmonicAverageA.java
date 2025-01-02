package Lab05;

import java.util.Scanner;

public class HarmonicAverageA {
	public static void main(String[] args) {
		int n;
		double sum = 0;

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 1; i <= n; i++)
			sum += 1 / scanner.nextDouble();
		System.out.println(n / sum);
		scanner.close();
	}
}
