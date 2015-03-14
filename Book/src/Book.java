
public class Book {

	private String author;
	private String title;
	private int numberOfPages;
	
	public String toString()
	{
		return "\n" + "Title: "  + title + "\n" + "Author: " + author + "\n" + "Pages: " +numberOfPages + "\n";
	}
	
	public Book(String title1, String author1, int numberOfPages1)
	{
		this.title = title1;
		this.author = author1;
		this.numberOfPages = numberOfPages1;
	}
}

	
