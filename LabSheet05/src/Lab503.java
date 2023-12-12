import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scanner.nextLine();
		
		int nichi = 0;
		String sentence = message.toLowerCase();
		if(sentence.indexOf("nichi")>=0) {
			nichi++;
		}
		
		if(nichi==0) {
			System.out.print(message);
		}
		else {
			System.out.print("Nichi is a sentence");
		}

	}

}
