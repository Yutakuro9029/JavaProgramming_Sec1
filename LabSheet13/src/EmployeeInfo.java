import java.util.*;
import java.io.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String choice,department;
		
		System.out.print("Insert or Read data? : ");
		choice = scan.next().toLowerCase();
		
		while(!(choice.equals("insert")||choice.equals("read"))) {
			System.out.print("Please type insert or read data? : ");
			choice = scan.next().toLowerCase();
		}
		
		SaveandOpen obj = new SaveandOpen();//for use insert method in SaveandOpen
		if(choice.equals("insert")) {
			obj.insert();
		}
		else {
			System.out.print("\nEnter dept : ");
			department = scan.next();
			obj.setDept(department);//can use setDept because SaveandOpen Class is extends Employee Class
			obj.read();//call read method from SaveandOpen Class
		}

	}

}
