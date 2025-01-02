package Lab04;

public class Question1 {
	public static void main(String[] args) {
		double a = 10;
		double b = 5;
		char operator = '+';
		System.out.println(simpleCalculator(a, b, operator));
		operator = '-';
		System.out.println(simpleCalculator(a, b, operator));
		operator = '*';
		System.out.println(simpleCalculator(a, b, operator));
		operator = '/';
		System.out.println(simpleCalculator(a, b, operator));
		operator = '%';
		System.out.println(simpleCalculator(a, b, operator));
	}

	public static double simpleCalculator(double a, double b, char operator) {
		switch (operator) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			case '/':
				if (b == 0) {
					System.out.println("Division by zero is not allowed");
					return 0;
				}
				return a / b;
			default:
				System.out.println("Invalid operator");
				return -1;
		}
	}
}
