import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Input your e-mail:");
		
		while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		
		email = email.toLowerCase();
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+email.toLowerCase());
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
	}
}
