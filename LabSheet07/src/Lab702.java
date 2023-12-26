import java.util.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] score = new double[5];
		double sum=0, avr=0;
		
		for(int i=0; i<score.length; i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = scanner.nextDouble();
			sum+=score[i];
		}
		System.out.println();
		avr = sum/score.length;
		System.out.println("Average of "+score.length+" students is "+avr);
		
		for(int i=0; i<score.length;i++) {
			if(score[i]>avr) {
				System.out.println("> Student "+(i+1)+"("+score[i]+")");
			}
		}

	}

}
