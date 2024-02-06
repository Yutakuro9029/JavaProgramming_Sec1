import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException {
		//using scanner class for read data from file.
		Scanner scan = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(scan.hasNext()) {
			//read names from file
			String fname = scan.next();
			scan.next(); // or String lname = scan.next();
			scan.next();// or String password = scan.next();
			String email = scan.next().toUpperCase();
			System.out.println(fname+" ("+email+")");
		}
		//close file
		scan.close();

	}

}
