import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		//create object for write data to file.
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt"));
		
		//create object for input data from keyboard or console.
		Scanner scan = new Scanner(System.in);
		int i =1;
		while(true) {// for input data instant
			System.out.print("Sentence: ");
			String word = scan.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			
			//save data to file(write file)
			writeFile.println(i+": "+word);
			i++;
		}
		
		System.out.println("File is save!!");
		writeFile.close();

	}

}
