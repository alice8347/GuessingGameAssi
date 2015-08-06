import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secretNo = (int)(Math.random() * 10);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		int entryNo = keyboard.nextInt();
		
		while (entryNo != secretNo) {
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			entryNo = keyboard.nextInt();
		}
		
		System.out.println("That's right! You're a good guesser.");
	}

}
