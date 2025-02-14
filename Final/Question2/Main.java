package Final.Question2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner	scanner;
		String	text;
		String	encryptedText;

		scanner = new Scanner(System.in);
		System.out.print("Enter text: ");
		text = scanner.nextLine();
		encryptedText = encrypt(text);
		System.out.println("Encrypted Text: " + encryptedText);
		scanner.close();
	}

	private static String encrypt(String text) {
		int		i;
		String	encryptedText = "";

		for (i = 0; i < text.length(); i++)
		{
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
			{
				if (text.charAt(i) == 'z')
					encryptedText += 'a';
				else
					encryptedText += (char) (text.charAt(i) + 1);
			} 
			else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')
			{
				if (text.charAt(i) == 'Z')
					encryptedText += 'A';
				else
					encryptedText += (char) (text.charAt(i) + 1);
			}
			else
				encryptedText += text.charAt(i);
		}
		return (encryptedText);
	}
}

