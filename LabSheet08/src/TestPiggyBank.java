import java.util.*;
public class TestPiggyBank {
	static Scanner scanner = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	static int insert;
	public static void main(String[] args) {
		inputCoin();
		MainMenu();
		/*PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal()); 
		pb.addFive(100);*/
	}
	
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please define size of PiggyBank : ");
		int sizeofPiggyBank = scanner.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		//pb.setPiggyBank(scanner.nextInt());
		System.out.println("Size of your PiggyBank : "+pb.getPiggyBank());
	}
	
	public static void MainMenu() {
		while(true) {
			System.out.println("========================");
			System.out.println("Menu of PiggyBank");
			System.out.println("========================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("========================");
			System.out.print("Please Select Menu[1-5] : ");
			int menu = scanner.nextInt();
			if(menu==1) {
				System.out.print("Insert 1 Baht Money : ");
				insert = scanner.nextInt();
				pb.addOne(insert);
				System.out.println("Money Total : "+pb.getTotal());
			}
			if(menu==2) {
				System.out.print("Insert 2 Baht Money : ");
				insert = scanner.nextInt();
				pb.addTwo(insert);
				System.out.println("Money Total : "+pb.getTotal());
			}
			if(menu==3) {
				System.out.print("Insert 5 Baht Money : ");
				insert = scanner.nextInt();
				pb.addFive(insert);
				System.out.println("Money Total : "+pb.getTotal());
			}
			if(menu==4) {
				System.out.print("Insert 10 Baht Money : ");
				insert = scanner.nextInt();
				pb.addTen(insert);
				System.out.println("Money Total : "+pb.getTotal());
			}
			if(menu==5) {
				System.out.print("BYE BYE");
				break;
			}
			//System.out.println("Money Total : "+pb.getTotal());
			System.out.println();
			
		}
	}

}
