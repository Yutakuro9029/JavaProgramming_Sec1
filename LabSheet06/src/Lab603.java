import java.util.*;
public class Lab603 {
	
	static Scanner scanner = new Scanner(System.in);
	static String initial,mname,lname,firstName;
	static int j=0;
	public static void main(String[] args) {
		System.out.println("Please enter your name, separated by a space.");
		String fullname = scanner.nextLine();
		
		//String firstName = fullname.substring(0,fullname.indexOf(' '));
				
		System.out.println(abbreviatName(fullname));
		
	}
	
	public static String abbreviatName(String fullname) {	
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				//initial = fullname.toUpperCase().charAt(j)+"."+fullname.toUpperCase().charAt(i+1)+".";
				firstName = fullname.substring(0,fullname.indexOf(' '));
				mname = fullname.substring(fullname.indexOf(' ')+1,fullname.indexOf(' ')+2);
				lname = fullname.substring(fullname.lastIndexOf(' ')+1,fullname.lastIndexOf(' ')+2);
			}
		}
		return 	mname+"."+lname+"."+firstName;
		//fullname.lastIndexOf(' ')
		//fullname.indexOf(' '),
		//Robert John Downy
		//().charAt(j)
	}

}
