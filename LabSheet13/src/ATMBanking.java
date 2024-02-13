import java.io.IOException;
import java.util.*;
public class ATMBanking {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account number : ");
		String account = scan.next();
		System.out.print("Enter password : ");
		String password = scan.next();
		System.out.print("Enter money : ");
		int accountMoney = scan.nextInt();
		
		ATMChecking bank = new ATMChecking(account,password,accountMoney);
		bank.show();
		

	}

}
