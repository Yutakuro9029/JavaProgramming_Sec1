import java.io.*;
import java.util.Scanner;
public class Lab1201 {

	public static void main(String[] args) throws Exception{
		Scanner readFile = new Scanner(new File("d://txtfile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			//read names from file
			String fname = readFile.next();
			String lname = readFile.next().substring(0,1).toUpperCase();
			readFile.next();// or String password = scan.next();
			String email = readFile.next().toUpperCase();
			System.out.println(lname+"."+fname+" ("+email+")");
		}
		//close file
		readFile.close();

	}
}

