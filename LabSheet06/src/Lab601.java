import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
		
		/*String email = JOptionPane.showInputDialog("Input your email:");*/
		
		/*while(checkEmail(email)==false) {
			email = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		
		if(checkEmail(email)==true) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+email.toLowerCase());
		}*/
		
		
		/*while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		
		boolean check = checkEmail(email);
		
		if(check) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+email.toLowerCase());
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}*/
		
		

	}
	
	public static void inputEmail() {
		String email = JOptionPane.showInputDialog("Input your email:");
		
		while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		
		boolean check = checkEmail(email);
		
		if(check) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+email.toLowerCase());
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
	}
	
	public static boolean checkEmail (String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else
			return false;
					
		/*if(email.startsWith("@")||email.startsWith(" "))
			return false;
		else 
			return true;*/
		
		//email.endsWith("hotmail.com")||email.endsWith("gmail.com")
		
	}

}
