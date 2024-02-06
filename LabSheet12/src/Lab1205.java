import java.io.*;
import java.util.Scanner;
public class Lab1205 {

	public static void main(String[] args) throws Exception{
		Scanner readFile = new Scanner(new File("d://txtfile//student.txt"));
		Head();
		int i =1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String fname = readFile.next().substring(0,1).toUpperCase();
			String lname = readFile.next();
			double grade = readFile.nextDouble();
			readFile.next();
			System.out.println(i+".\t"+id+"\t"+Level(id)+"\t"+fname+"."+lname+"\t"+grade+"\t"+Status(grade));
			i++;
		}
		readFile.close();
	}
	
	public static String Level(String id) {
		if(id.startsWith("19")) {
			return "3th";
		}
		else
			return "4th";
	}
	
	public static String Status(double grade) {
		if(grade>2.0) {
			return "Pass";
		}
		else if(grade>=1.0&&grade<=2.0) {
			return "Critical";
		}
		else {
			return "Retired";
		}
	}
	
	public static void Head() {
		System.out.println("*********************************************************************************");
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("*********************************************************************************");
	}

}
