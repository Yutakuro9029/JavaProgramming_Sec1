import javax.swing.*;
public class Lab602 {

	public static void main(String[] args) {
		int inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		
		while(!(checkYear(inputYear))) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000\nInput year, again "
					+ ":"));
		}
		
		/*if(isLeapYear(inputYear)) {
			JOptionPane.showMessageDialog(null, inputYear + " is Leap year.");
		}
		else {
			JOptionPane.showMessageDialog(null, inputYear + " is NOT Leap year.");
		}*/
		
		JOptionPane.showMessageDialog(null, inputYear + " is "+ (isLeapYear(inputYear)?"Leap year.":"NOT Leap year."));
		//JOptionPane.showMessageDialog(null, isLeapYear(inputYear)?inputYear+" is Leap year.":inputYear+" is NOT Leap year.");
	
	}
	
	public static boolean checkYear(int year) {
		if(year>=100&&year<=3000)
			return true;
		else
			return false;
	}
	
	
	public static boolean isLeapYear(int year) {
		if((year%4==0)&&(year%100!=0)||(year%400==0))
			return true;
		else
			return false;
	}

}
