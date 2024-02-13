import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		Scanner scan = new Scanner(System.in);
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		String answer;
		do {
			header();//call header method from employee class
			System.out.print("Enter name     : ");
			this.name = scan.next();
			System.out.print("Enter department : ");
			this.dept = scan.next();
			//save all data to employee.txt file
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data agian? : ");
			answer = scan.next();
		}while(answer.equalsIgnoreCase("y"));
		
		writeFile.close();
		
	}
	
	public void read() {//using try-catch, so no need to use throws IOException
		try{
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			int count = 0;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(name);
					check = true;
					count++;
				}
			}
			if(check==false) {
				System.out.println("Sorry no dept : "+super.getDept()+" in file.");
			}
			else if(check==true) {
				System.out.println("Employee in dept "+super.getDept()+" is "+count+"person.");
			}
		}
		catch(IOException e) {
			System.out.println("Sorry, File not found");
		}
	}
}
