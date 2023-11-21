import javax.swing.*;
import java.util.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int withdrawMoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)
		+"\nInput money to withdraw :"));
		if(withdrawMoney>balance)
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		else if (withdrawMoney>20000)
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		else if(withdrawMoney%100!=0)
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+withdrawMoney%100+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		else 
			JOptionPane.showMessageDialog(null,"You withdraw "+withdrawMoney+" baht."
					+ "\n1,000 = "+withdrawMoney/1000+"\n500 = "+(withdrawMoney%1000)/500+"\n100 = "+((withdrawMoney%1000)%500)/100);

	}

}
