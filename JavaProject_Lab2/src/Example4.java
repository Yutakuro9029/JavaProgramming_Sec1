import javax.swing.*;
import java.text.*;
public class Example4 
{

	public static void main(String[] args) 
	{
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName =JOptionPane.showInputDialog("Input Product Name:");
		
		/*String strUnit = JOptionPane.showInputDialog("Input Product Unit:");
		int productUnit = Integer.parseInt(strUnit);*/
		
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit:"));//ย่อให้สั้นกว่าเดิม
		
		/*String strPrice = JOptionPane.showInputDialog("Input Price per unit:");
		float productPrice = Float.parseFloat(strPrice);*/
		
		float productPrice = Float.parseFloat(JOptionPane.showInputDialog("Input Price per unit"));//ย่อให้สั้นกว่าเดิม
		
		
		float totalPrice = productPrice*productUnit;
		float vat = totalPrice*107/100;
		
		JOptionPane.showMessageDialog(null, "Total Price is "+frm.format(totalPrice)+" baht."
				+ "\nAdd VAT 7% is "+frm.format(vat)+" baht.");

	}

}
