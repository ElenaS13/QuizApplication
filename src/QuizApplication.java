import java.util.Scanner;

public class QuizApplication {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter a character: ");
		char newChar = scan.next().charAt(0);
		System.out.println("you entered "+ newChar);
		

	}

}
