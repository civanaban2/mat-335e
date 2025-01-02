package Lab11.Question1;

public class Test {
	public static void main(String[] args) {
		Book[] myShelf = new Book[4];

		myShelf[0] = new Novel("The Alchemist", "Paulo Coelho", 1, 200, 300);
		myShelf[1] = new Novel("The Da Vinci Code", "Dan Brown", 2, 500, 400);
		myShelf[2] = new Poem("The Waste Land", "T. S. Eliot", 3, 100, 200, 250);
		myShelf[3] = new Poem("The Raven", "Edgar Allan Poe", 4, 150, 300, 350);

		for (Book book : myShelf) {
			System.out.println(book.getBookName() + " by " + book.getAuthor() + " has " + book.calculateWordsNumber() + " words");
		}
	}
}