import javax.swing.*;

public class Icecream {

	public static void main(String[] args) {
		int flavor;
		int chocolatePrice = 15,vanillaPrice = 10,topping = 5;
		do {
		flavor = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B."
				+ "\n[2] Chocolate Flavor 15 B."+"\nPress number to choose flavor:s"));
		if(flavor!=1||flavor!=2) 
    	  JOptionPane.showMessageDialog(null, "ERROR: Wrong choice!\nTry again...","ERROR",JOptionPane.ERROR_MESSAGE);
		}while(flavor!=1||flavor!=2);
	
		int option = JOptionPane.showConfirmDialog(null, "Do you want to add topping?","Topping",JOptionPane.QUESTION_MESSAGE);
		if(option == JOptionPane.YES_OPTION) {
			if(flavor==1)
			JOptionPane.showMessageDialog(null, "You choose Vanilla Flavor"+ "\nAnd with topping"+"\nTotal price = "+ vanillaPrice+topping+"baht.");
			if(flavor==1)
			JOptionPane.showMessageDialog(null, "You choose Chocolate Flavor"+ "\nAnd with topping"+"\nTotal price = "+ chocolatePrice+topping+"baht.");
		
		}
		else if (option == JOptionPane.NO_OPTION) {
			if(flavor==1)
			JOptionPane.showMessageDialog(null, "You choose Vanilla Flavor"+ "\nAnd no topping"+"\nTotal price = "+vanillaPrice+"baht.");
			else if(flavor==2)
			JOptionPane.showMessageDialog(null, "You choose Chocolate Flavor"+ "\nAnd no topping"+"\nTotal price = "+chocolatePrice+"baht.");
		}
	
	
	}
	


}
