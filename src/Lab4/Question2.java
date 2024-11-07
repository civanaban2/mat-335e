package Lab4;

public class Question2 {
	public static void main(String[] args) {
		int k = 123545;
		int d = 5;
		System.out.println(find_digit(k, d));
		d = 1;
		System.out.println(find_digit(k, d));
		d = 9;
		System.out.println(find_digit(k, d));
		d = 0;
		System.out.println(find_digit(k, d));
	}

	public static int find_digit(int k, int d){
		int idx = 0;
		int result = 0;
		while (k > 0){
			if (k % 10 == d)
				result = idx;
			k /= 10;
			idx++;
		}
		return result;
	}
}
