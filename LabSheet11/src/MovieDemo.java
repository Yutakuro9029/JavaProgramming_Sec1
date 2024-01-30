import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input movie id   : ");
		String movieId = scanner.nextLine();
		System.out.print("Input movie name : ");
		String movieName = scanner.nextLine();
		System.out.println();
		
		System.out.print("Input director name   : ");
		String directorName = scanner.nextLine();
		System.out.print("Input director email  : ");
		String directorEmail = scanner.nextLine();
		System.out.print("Input director gender : ");
		char gender = scanner.next().charAt(0);
		while(gender!='m'||gender!='M'||gender!='f'||gender!='F') {
			System.out.print("Input director gender, again : ");
			gender = scanner.next().charAt(0);
		}
		
		System.out.println();
		System.out.print("Input movie theater no. : ");
		int theaterNo = scanner.nextInt();
		while(!(theaterNo>=1&&theaterNo<=15)) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scanner.nextInt();
		}
		System.out.println();
		
		//Theater theater = new Theater(movieId,movieName,theater.setDirector(directorName,directorEmail,gender),theaterNo);
		
		//System.out.print(theater);
	}

}
