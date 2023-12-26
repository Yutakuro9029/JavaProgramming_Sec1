import java.util.*;
public class Lab604 {

	static Scanner scanner = new Scanner(System.in); //use for another method *must declare static.
	static String studentId,subId;
	static int subjectId;
	static boolean stdIT,subIT;
	
	public static void main(String[] args) {
		inputStudent();
	}
	
	public static void inputStudent() {
		do {
			System.out.print("Enter Student ID : ");
			studentId = scanner.next();
			
			System.out.print("Enter Subject ID : ");
			subjectId = scanner.nextInt();
			subId = subjectId+""; //convert subjectId from int to String.
		}while(!isLength(studentId,subId)); //input again if isLength = false.
		System.out.println();
		displayData(isITStudent(studentId),isITSubject(subId));
	}
	
	
	public static boolean isLength(String sid , String subId) {
		if(sid.length()==10 && subId.length()==7) {
			return true;
		}
		return false;
	}
	
	
	public static boolean isITStudent(String sid) {
		if(sid.substring(0,3).equals("211")&&sid.substring(3,6).equals("311")) {
			return true;
		}
		return false;
	}
	
	
	public static boolean isITSubject(String subId) {
		if(subId.substring(0,2).equals("21")&&subId.substring(4,5).equals("1")) {
			return true;
		}
		return false;	
	}
	
	
	public static void displayData(boolean stdIT,boolean subIT) {
		if(stdIT==true) {
			System.out.println("Student id: "+studentId + " 1st year student in IT");
		}
		else {
			System.out.println("Student id: "+studentId + " is not 1st year student in IT");
		}
		
		
		if(subIT==true) {
			System.out.println("Enroll in courses for Year 1 ");
		}
		else{
			System.out.println("Not enroll in courses for Year 1 ");
		}
	}
	

}
