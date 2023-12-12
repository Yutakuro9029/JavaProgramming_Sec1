import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input your full name : ");
		String fullname = scanner.nextLine();
								
		int j =0;
		String firstname , midname;
		for(int i =0; i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				System.out.println(fullname.toUpperCase().charAt(j)+"."+fullname.toUpperCase().charAt(i+1)+"."
									+fullname.substring(i,(fullname.length())));
			}	
		}
		
	
	}
}
