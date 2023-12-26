import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int array[] = {78, 36, 58, 41, 25, 92 ,75};
		int index;
		
		System.out.print("Input index of array : ");
		index = scanner.nextInt();
		while(!(index>=0&&index<array.length)) {
			System.out.print("Input index of array, again : ");
			index = scanner.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Value in current index is "+array[index]);		
		if(index==array.length-1) {		
			System.out.println("Sorry, "+index+" is the last index in array.");
		}
		else {
			System.out.println("Value in next    index is "+array[index+1]);
		}
		

	}

}
