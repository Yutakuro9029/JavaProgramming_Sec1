import javax.swing.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("###.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input height:"));
		double bmi = weight/(Math.pow(height/100,2));
		/*if(bmi<18.5) 
			JOptionPane.showMessageDialog(null, "BMI = "+String.format("%.1f",bmi) + "\n You're Underweight","BMI",JOptionPane.WARNING_MESSAGE);
		else if(bmi<25) 
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi) + "\n You're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);
		else if(bmi<30) 
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi) + "\n You're Overweight","BMI",JOptionPane.WARNING_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi) + "\n You're Obesity","BMI",JOptionPane.WARNING_MESSAGE);*/
		String bmiCategory;
		if(bmi<18.5) bmiCategory="Underweight";
		else if(bmi<25) bmiCategory="Normal-weight";
		else if(bmi<30) bmiCategory="Overweight";
		else bmiCategory="Obesity";
		JOptionPane.showMessageDialog(null,"BMI = "+ String.format("%1f",bmi)+"\nYou're "+bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
	
	
	}

}
