import java.io.*;
import java.util.Scanner;
public class Lab1204 {

	public static void main(String[] args) throws Exception{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter rating of books: ");
		double ratingInput = scanner.nextDouble();
			
		String tmp="";
		int countBook = 0,i=0;
		System.out.println("------------------------------------------------------");
		while((tmp=readFile.readLine())!=null){
			String []data = tmp.split("\t");
			double rating = Double.parseDouble(data[2]);
			i++;
			if(rating>=ratingInput) {
				System.out.println("Book "+i+":"+data[0]+" write by "+data[1]+" ("+data[3]+") reviews");
				countBook++;
			}
		}
		readFile.close();
		System.out.println("------------------------------------------------------");
		System.out.println("There are "+countBook+" books get rating more than "+ratingInput);
		
	}

}
