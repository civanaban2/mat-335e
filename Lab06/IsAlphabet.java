package Lab06;

import java.security.SecureRandom;

public class IsAlphabet {
	public static void main(String[] args) {
		SecureRandom randomNumber = new SecureRandom();
		int c = randomNumber.nextInt(128);
		System.out.printf("The number is: %d, and The character is: %c\n", c, c);
		if (isAlpha((char)c))
			System.out.println("Character is alphabet");
		else
			System.out.println("Character is not alphabet");
	}

	public static boolean isAlpha(char c)
	{
		return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
	}
}
