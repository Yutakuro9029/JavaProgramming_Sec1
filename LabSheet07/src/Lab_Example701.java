
public class Lab_Example701 {

	public static void main(String[] args) {
		int[] num = {12,50,93,45,75,52,80};
		
		for(int i=0; i<num.length; i++) {
			System.out.println("num["+i+"] = "+num[i]);
		}
		
		System.out.println();
		System.out.println("Using foreach to display value of array");
		
		int j =0;
		for(int _num : num) {
			System.out.println("num["+j+"] = "+_num);
			j++;
		}
		System.out.println();
		printArrayNumber(num);
	}
	
	public static void printArrayNumber(int[] number) {
		System.out.println("Using method to display valut of array");
		
		for(int i=0; i<number.length; i++) {
			System.out.println("num["+i+"] = "+number[i]);
		}
	}

}
