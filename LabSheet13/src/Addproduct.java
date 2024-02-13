import java.io.*;
import java.util.*;
public class Addproduct {

	public static void main(String[] args) throws IOException{
		//create object for input data from keyboard or console.
		Scanner scan = new Scanner(System.in);
		
		//create object for write data to file (using PrintWriter Class)
		PrintWriter writeFile = new PrintWriter (new FileWriter("d://txtFile//product.txt",true));

		System.out.print("Input Product Id : ");
		String id = scan.next();
		System.out.print("Input Product Name : ");
		String name = scan.next();
		System.out.print("Input Product Unit : ");
		int unit = scan.nextInt();
		System.out.print("Input Product Price : ");
		float price = scan.nextFloat();
		
		//insert all data to file after the previous data
		
		writeFile.println(id+","+name+","+unit+","+price);
		System.out.println("Save file already...");
		
		writeFile.close();

	}

}
