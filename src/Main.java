import fleet.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Services util = new Services();
		String lines = "---------------------------------";

		System.out.println("Welcome to the Naval Thunder\n\tAttack Calculator!\n" + lines);
		System.out.println("Scenarios Available to Play:\n" +
				"\t1. Komandorski Islands");
		System.out.println(lines);
		System.out.print("Which Scenario Do You Want to Play? -->");
		switch (keyboard.nextInt()) {
			// komandorski islands
			case 1:
				KomandorskiIslands.main();
				break;
			default:
				System.out.println("Goodbye");
				System.exit(0);
		}


	}
}
