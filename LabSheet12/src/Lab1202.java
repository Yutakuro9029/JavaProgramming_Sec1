import java.io.*;
import java.util.Scanner;
public class Lab1202 {

	public static void main(String[] args) throws Exception{
		Scanner readFile = new Scanner(new File("d://txtfile//MemberLogin.txt"));
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input your email : ");
		String inputEmail = scanner.nextLine();
		
		boolean check=false;
		while(readFile.hasNext()) {
			readFile.next();//first name
			readFile.next();//last name
			String password = readFile.next();
			String email = readFile.next();
			
			if(inputEmail.equalsIgnoreCase(email)) {
				System.out.println("Your password is "+password);
				check = true;
				if(check)
					break;
				}
			else
				check = false;
		}
		readFile.close();
		
		if (check==false)
			System.out.println("The data not found...");
		//close file

	}

}
