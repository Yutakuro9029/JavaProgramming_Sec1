import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Author[] author = new Author[4];	
		
		for(int i =0;i<author.length;i++) {
			System.out.println("Information Author "+(i+1));
			System.out.println("---------------------------------------------------");
			System.out.print("Input author name   : ");
			author[i] = scanner.nextLine();
			System.out.print("Input author email  : ");
			author[i] = scanner.nextLine();
			System.out.println("---------------------------------------------------");		
		}		
		
		for(int i =1;i<author.length;i++) {
			System.out.println(i+"."+" "+author[i]+" ("+author[i]+")");
		}
	
	}

}
