package exam;

public class Book implements Readable {
	
	private String title, author;
	private int numPages;
	
	public Book(String title, String author, int getNumPages) {
		this.title = title;
		this.author = author;
		this.numPages = getNumPages;
	}

	public String toString() {
		return "'" + this.title + "' by " + this.author + ", " + numPages + " pages";
	}

	public String title() {
		return this.title;
	}

	public String author() {
		return this.author;
	}

	public int numPages() {
		return this.numPages;
	}
	public boolean isBook() {
		return true;
	}

	@Override
	public int getNumArticles() {
		return 0;
	}

	
}
