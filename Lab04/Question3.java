package Lab04;

public class Question3 {
	public static void main(String[] args) {
		TriangleType(3, 3, 3);
		TriangleType(3, 3, 2);
		TriangleType(3, 4, 5);
	}

	public static void TriangleType (int a, int b, int c){
		if (a == b && b == c){
			System.out.println("Equilateral");
		}
		else if (a == b || b == c || a == c){
			System.out.println("Isosceles");
		}
		else{
			System.out.println("Scalene");
		}
	}
}
