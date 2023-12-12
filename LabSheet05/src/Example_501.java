import java.util.*;
public class Example_501 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word,sentence="";
		while(true) {
			System.out.print("Enter Word: ");
			word = scanner.next();
			
			if(word.equalsIgnoreCase("stop"))
				break;
			
			sentence = sentence+word+" ";
		}
		System.out.print(sentence.toUpperCase());
	}

}
