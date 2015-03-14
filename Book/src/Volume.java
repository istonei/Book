
public class Volume {

	private String volumeName;
	private int numberOfBooks;
	private Book[] z;
	
	public Volume(String volumeName1, int numberOfBooks1, Book[] z1)
	{
		this.volumeName = volumeName1;
		this.numberOfBooks = numberOfBooks1;
		this.z = z1;
	}
	public String toString()
	{
		return "Volume: " + volumeName + "\n" + "Number of books: " + numberOfBooks;
	}
	public String getBookArray()
	{
		String t = "";
		for(int i = 0; i < z.length; i++)
		{
			t = t + (z[i].toString());
		}
		return t;
	}
}
