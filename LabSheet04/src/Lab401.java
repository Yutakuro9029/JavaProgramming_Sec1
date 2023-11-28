import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int preNum = scanner.nextInt();
		
		int postNum;
		System.out.print("Input value of Y : ");
		postNum = scanner.nextInt();
		
		while (postNum <=preNum) {
			System.out.print("Input value of Y, again: ");
			postNum = scanner.nextInt();
		}
		
		System.out.println();
		int preNumAfter = preNum+1;
		for(int i =preNum; i<postNum;i++) {
			int sum = preNum+preNumAfter;
			System.out.println(preNum + "+" + preNumAfter + "=" + sum);
			preNumAfter++;
			preNum=sum;
		}
		
		}
	}
		
		
