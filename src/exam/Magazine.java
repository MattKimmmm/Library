package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Magazine implements Readable {

	private String title;
	private int numPages;
	private Map<Integer, String> articles = new HashMap <> ();
	
	//You MUST use this HashMap to store the articles
//	private HashMap<Integer, String> articles = new HashMap <> ();
	public Magazine (String title, int getNumPages) {
		this.title = title;
		this.numPages = getNumPages;
	}
	public void addArticle(int page, String title) {
		articles.put(page, title);
	}
	
	public String title() {
		return this.title;
	}
	public int numPages() {
		return this.numPages;
	}
	public boolean isBook() {
		return false;
	}
	public int getNumArticles() {
		return articles.size();
	}


	public String toString() {
		String str = this.title + ", " + this.numPages + " pages" + "\n";
		for (int page : articles.keySet()) {
			str = str + "page " + page + ", " + articles.get(page) + "\n";
		}
		return str; 
	}
}
