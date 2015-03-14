import java.util.Scanner;

public class DemoVolume {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter volume name: ");
		String volumeName1 = keyboard.nextLine();
		System.out.println("Enter number of books: ");
		int numberOfBooks1 = keyboard.nextInt();
		Book[] b = new Book[numberOfBooks1];
		
		for (int i = 0; i < b.length; i++)
		{
			Scanner keyboard1 = new Scanner(System.in);
			System.out.println("Book " + i);
			System.out.println("Enter title of book: ");
			String title = keyboard1.nextLine();
			System.out.println("Enter author of book: ");
			String author = keyboard1.nextLine();
			System.out.println("Enter total pages: ");
			int pages = keyboard.nextInt();
			
			b[i] = new Book(title, author, pages);
		}
		
		Volume volumedisplay = new Volume(volumeName1, numberOfBooks1, b);
		System.out.println(volumedisplay);
		System.out.println(volumedisplay.getBookArray());
		
		
		

	}

}
