import java.util.*;
import java.io.*;
import java.text.*;
public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accountNumber,String password,int money ) {
		super(accountNumber,password);
		this.money = money;
	}

	public boolean checkBookBank() throws IOException {
		Scanner readFile = new Scanner(new File("d://ATMBookBank.txt"));
		boolean check = true;
		while(readFile.hasNext()) {
			String accountFile = readFile.next();
			String passwordFile = readFile.next();
			int moneyFile = readFile.nextInt();
			if(!(super.getID().equals(accountFile))) {
				check = false;
			}
			else if(!(super.getPass().equals(passwordFile))) {
				check = false;
			}
			else if(money<=0||money>moneyFile) {
				check = false;
			}
		}
		return check;
	}
	
	public void show() throws IOException {
		DecimalFormat format = new DecimalFormat("####,00");
		int thousand = money/1000;
		int fiveHundred = (money%1000)/500;
		int oneHundred = ((money%1000)%500)/100;
		if(checkBookBank()==true) {
			System.out.println("You drawing for "+format.format(money)+", get");
			System.out.printf("\t1000 = "+thousand+"\n\t500 = "+fiveHundred+"\n\t100 = "+oneHundred
					+"\nYour balance is "+(-money)+" Baht.");
		}
		else if (checkBookBank()==false){
			System.out.println();
			System.out.println("Sorry, your id or password is wrong, or your amount is not enough.");
		}
	}
	
	
}
