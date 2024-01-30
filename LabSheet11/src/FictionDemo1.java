import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Book's name  : ");
		String title = scanner.nextLine();
		System.out.print("Input publish year : ");
		int year = Integer.parseInt(scanner.nextLine());
		FictionBook book = new FictionBook(title,year);
		
		System.out.print("Input author's name  : ");
		String author = scanner.nextLine();
		book.setAuthorName(author);
		while(book.checkFormatName()==false) {
			System.out.print("Input author's name  : ");
			author = scanner.nextLine();
			book.setAuthorName(author);
		}
		System.out.print("Input author's email : ");
		String email = scanner.nextLine();
		book.setEmail(email);
		while(book.checkEmail()==false) {
			System.out.print("Input author's email, again : ");
			email = scanner.nextLine();
			book.setEmail(email);
		}
		
		
		System.out.println(book);
		

	}

}
