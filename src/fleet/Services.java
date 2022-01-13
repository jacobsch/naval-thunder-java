package fleet;

import java.util.Scanner;

public class Services {
	public static Scanner keyboard = new Scanner(System.in);

	/**
	 * Prompts user to enter yes or no, then returns the respective boolean
	 * @return boolean returns true if input is yes or y
	 */
	public boolean yesOrNo() {
		String yesOrNo = keyboard.nextLine();

		while (!(yesOrNo.toLowerCase().equals("yes") || yesOrNo.toLowerCase().equals("no") || yesOrNo.toLowerCase().equals("y") || yesOrNo.toLowerCase().equals("n"))) {
			System.out.print("Oops! Please Enter Either Yes or No (y/n) --> ");
			yesOrNo = keyboard.nextLine();
		}

		yesOrNo = yesOrNo.toLowerCase();
		return yesOrNo.equals("yes") || yesOrNo.equals("y");
	}
}
