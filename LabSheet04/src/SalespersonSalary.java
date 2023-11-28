import java.util.*;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL =-1;
		
		int sales;
		double salary;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.print("Enter sales in dollars (or -1 to end): ");
		sales = scanner.nextInt();
		if(sales ==SENTINEL) {
			System.out.print("BYE");
			break;
		}		
		salary = 1000+(sales*COMMISSION_RATE);
		System.out.print("Salary is: "+frm.format(salary));
		System.out.println();
		
		}while(true);
		
	}

}
