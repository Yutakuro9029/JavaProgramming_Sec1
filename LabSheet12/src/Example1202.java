import java.io.*;
import java.util.Scanner;
public class Example1202 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Section: ");
		int section = scanner.nextInt();
		header(section);
		showListStudent(section);

	}
	
	public static void showListStudent(int sectionInput) throws IOException{
		//read data from file
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp="";
		while((tmp=readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			//read midterm and final score from file to display
			double midScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int sectionFromFile = Integer.parseInt(data[3]);
			
			if(sectionFromFile==sectionInput) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midScore+"\t"+finalScore+"\t"+findResult(midScore,finalScore));
			}
		}
		readFile.close();
	}
	
	public static String findResult(double midterm, double finalscore) {
		double totalScore = midterm + finalscore;
		/*if(totalScore<40) 
			return "Fail";
		else 
			return "Pass";*/
		return totalScore>=40?"Pass":"Fail";
	}
	
	public static void header(int sec) {
		System.out.println("*********************************************************************************");
		System.out.println("\t\t\tList of Data for Section "+sec);
		System.out.println("*********************************************************************************");
	}

}
