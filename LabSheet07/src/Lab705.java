import javax.swing.*;
public class Lab705 {

	static String even="",odd="";
	
	public static void main(String[] args) {
		int num[] = new int[5];
		
		for (int i =0; i<num.length;i++) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" :"));
		num[i]=input;
		}
		showEven(num);
		showOdd(num);
	}
	
	public static void showEven(int[] nums) {
		for(int _nums:nums) {
			if(_nums%2==0) {
				even+=_nums+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+even);
	}
	
	public static void showOdd(int[] nums) {
		for(int _nums:nums) {
			if(_nums%2!=0) {
				odd+=_nums+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number:\n"+odd);
	}
	

}
