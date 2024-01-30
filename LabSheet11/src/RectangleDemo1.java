import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		//input data using abstract class
		/*double width = Double.parseDouble(JOptionPane.showInputDialog("Input width : "));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input length : "));
		String color = JOptionPane.showInputDialog("Input color : ");
		
		// Send arguments to Constructor
		Rectangle rectangle = new Rectangle(width,length,color);
		
		JOptionPane.showMessageDialog(null, rectangle+"\nArea of Rectangle = "+rectangle.getArea());*/
		
		//input data using interface class
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input width : "));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input length : "));
		
		Rectangle2 rectangle2 = new Rectangle2(width,length);
		JOptionPane.showMessageDialog(null, rectangle2+"\nArea of Rectangle = "+rectangle2.getArea());

	}

}
