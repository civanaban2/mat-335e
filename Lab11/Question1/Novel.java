package Lab11.Question1;

public class Novel extends Book{
	private int wordsPerPage;
	
	public Novel(String bookName, String author, int shelfNo, int pageNumber, int wordsPerPage) {
		super(bookName, author, shelfNo, pageNumber);
		this.wordsPerPage = wordsPerPage;
	}
	
	public int calculateWordsNumber() {
		return getPageNumber() * wordsPerPage;
	}
	
	public int getWordsPerPage() {
		return wordsPerPage;
	}
	public void setWordsPerPage(int wordsPerPage) {
		this.wordsPerPage = wordsPerPage;
	}
}