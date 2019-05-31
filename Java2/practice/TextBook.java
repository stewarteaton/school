package todayNow;

public class TextBook {
	//instance fields
	private String title;
	private String author;
	private String publisher;
	
	//constructors
	public TextBook(String t, String a, String p) {
		title = t;
		author = a;
		publisher = p;
	}
	public TextBook(TextBook object2) {
		title = object2.title;
		author = object2.author;
		publisher = object2.publisher;
	}
	
	//setter
	public void set(String t, String a, String p) {
		title = t;
		author = a;
		publisher = p;
	}
	
	//getters
	
	//toString method
	public String toString() {
		String str = "\n\tTitle: " + title + "\n\tAuthor: " + author + "\n\tPublisher: " + publisher;
		return str;
	}
}
