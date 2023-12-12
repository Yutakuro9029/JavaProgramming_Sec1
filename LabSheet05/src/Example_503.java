import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence;
		
		System.out.print("Input a sentence : ");
		sentence = scanner.nextLine();
		
		while(!(sentence.endsWith("."))) {
			System.out.print("Input a sentence, again : ");
			sentence = scanner.nextLine();
		}
		System.out.println();
		
		int spacebar = 0;
		
		for(int i =0; i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spacebar++;
			}
		}
		
		System.out.println("This sentence has "+spacebar+" spacebar.");		
		System.out.println("This sentence has "+(spacebar+1)+" word.");

	}

}
