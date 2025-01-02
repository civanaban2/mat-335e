package Lab11.Question1;

public class Poem extends Book {
	private int wordsPerOddPage;
	private int wordsPerEvenPage;

	public Poem(String bookName, String author, int shelfNo, int pageNumber, int wordsPerOddPage, int wordsPerEvenPage) {
		super(bookName, author, shelfNo, pageNumber);
		this.wordsPerOddPage = wordsPerOddPage;
		this.wordsPerEvenPage = wordsPerEvenPage;
	}

	public int calculateWordsNumber() {
		if (getPageNumber() % 2 == 0)
			return (getPageNumber() / 2) * (wordsPerOddPage + wordsPerEvenPage);
		else
			return ((getPageNumber() / 2) + 1) * wordsPerOddPage + (getPageNumber() / 2) * wordsPerEvenPage;
	}

	public int getWordsPerOddPage() {
		return wordsPerOddPage;
	}
	public void setWordsPerOddPage(int wordsPerOddPage) {
		this.wordsPerOddPage = wordsPerOddPage;
	}
	public int getWordsPerEvenPage() {
		return wordsPerEvenPage;
	}
	public void setWordsPerEvenPage(int wordsPerEvenPage) {
		this.wordsPerEvenPage = wordsPerEvenPage;
	}
}