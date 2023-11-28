import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number : ");
		int preNumber = scanner.nextInt();
		
		int postNumber;
		
		while(true) {
			System.out.print("Input a number : ");
			postNumber = scanner.nextInt();
			if(postNumber<preNumber) {
				System.out.print("BYE BYE");
				break;
			}
			preNumber = postNumber;
		}

	}

}
