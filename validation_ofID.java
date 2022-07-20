package practice_project;
import java.util.Scanner;
import java.util.ArrayList;
public class validation_ofID {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> email = new ArrayList<String>();
		email.add("abarna@gmail.com");
		email.add("tom@gmail.com");
		email.add("mike@gmail.com");
		System.out.println("ENTER USER EMAIL ID:");
		String userId = sc.nextLine();
			if (email.contains(userId)) {
				System.out.println();
				System.out.println("email ID " + userId + " found");
			} 
			else {
				System.out.println("email ID " + userId + " Not found");

			}
		sc.close();	
	}
}