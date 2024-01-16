import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Author author = new Author();
		
		System.out.print("Input author name   : ");
		String name = scanner.nextLine();
		System.out.print("Input author email  : ");
		String email = scanner.nextLine();
		System.out.print("Input author gender : ");
		char gender = scanner.next().toUpperCase().charAt(0);
		
		Author author = new Author(name,email,gender);
		
		System.out.print(author);
		
		
		//Lee Johnson, j.lee@gmail.com, m	
	}

}
