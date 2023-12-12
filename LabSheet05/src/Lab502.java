import java.util.*;

public class Lab502 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input some sentence : ");
		String sentence = scanner.nextLine();
		
		while(!(sentence.endsWith("."))) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scanner.nextLine();
		}
		System.out.println();
		
		//The cat is sleeping on the bed.
		int j=0;
		
		for(int i =0; i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				System.out.println(sentence.substring(j,i));
				j=i+1;
			}
		}
		
		System.out.println(j);
	
	}

}
