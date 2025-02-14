package Final.Question3;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lthreshold, uthreshold;
		int[][] matrix = generateMatrix(100, 100, 1, 1000);
		int noise = 0;
		double ratio;

		System.out.print("Lower Threshold: ");
		lthreshold = scanner.nextInt();
		System.out.print("Upper Threshold: ");
		uthreshold = scanner.nextInt();
		System.out.println();

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (matrix[i][j] < lthreshold || matrix[i][j] > uthreshold) {
					noise++;
				}
			}
		}

		ratio = (double) noise / 10000;

		System.out.println("Matrix:");
		printMatrix(matrix, 100, 100);

		System.out.printf("Noise Ratio: %f%%\n", ratio * 100);
		scanner.close();
	}

	private static int[][] generateMatrix(int rows, int cols, int rangeMin, int rangeMax) {
		SecureRandom random = new SecureRandom();
		int[][] matrix = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = random.nextInt(rangeMax - rangeMin + 1) + rangeMin;
			}
		}

		return matrix;
	}

	private static void printMatrix(int[][] matrix, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf("%-4d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
