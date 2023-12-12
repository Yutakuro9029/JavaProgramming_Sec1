import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String fullName;
		System.out.print("Full Name: ");
		fullName = scanner.nextLine();
		
		int space = fullName.trim().indexOf(" ");
		
		if(space==-1) {
			System.out.print("Incorrect Name");
		}
		else {					
			System.out.println("First Name: "+fullName.substring(0,space).toUpperCase());
			System.out.println("Last Name: "+fullName.substring((space+1),fullName.length()).toLowerCase());
		}						

	}

}

