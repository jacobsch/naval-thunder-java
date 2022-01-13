import fleet.*;
import fleet.american.Benson;
import fleet.japanese.Akatsuki;

import java.lang.reflect.AnnotatedArrayType;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class KomandorskiIslands {

	public static Ship pickShip(String shipName) {

		switch (shipName) {
			// AMERICAN FLEET
			case "Bailey":
				return AmericanFleet.Bailey;
			// JAPANESE FLEET
			case "Ikazuchi":
				return JapaneseFleet.Ikazuchi;
			// FAILSAFE
			default:
				return null;
		}
	}

	public static void battleShipShootingPhase() {
		System.out.println(LINES);
		// AMERICAN TURN
		System.out.println(playerUSA + " (USA), do you want to attack " + playerJPN + " (JPN)" +
				"\nwith one of your battleships? (y/n) -->");
		if (util.yesOrNo()) {
			boolean isFinished = false;
			do {
				System.out.print("Which American Ship is shooting? -->");
				String from = keyboard.nextLine();

				System.out.print("Which Japanese Ship are you targeting? -->");
				String to = keyboard.nextLine();

				System.out.print("What Arc Are You Shooting from? (F/P/S/A) -->");
				char arc = keyboard.nextLine().charAt(0);

				System.out.print("What Distance Are You Shooting from? -->");
				int distance = keyboard.nextInt();

				shootingPhase(pickShip(from), pickShip(to), arc, distance);

				System.out.print(playerUSA + ", do you want to strike another attack? (y/n) -->");
				isFinished = !util.yesOrNo();

			} while (!isFinished) ;
		} // end of american turn
		// JAPANESE TURN
		System.out.println(playerJPN + " (JPN), do you want to attack " + playerUSA + " (USA)" +
				"\nwith one of your battleships? (y/n) -->");
		if (util.yesOrNo()) {
			boolean isFinished = false;
			do {
				System.out.print("Which Japanese Ship is shooting? -->");
				String from = keyboard.nextLine();

				System.out.print("Which American Ship are you targeting? -->");
				String to = keyboard.nextLine();

				System.out.print("What Arc Are You Shooting from? (F/P/S/A) -->");
				char arc = keyboard.nextLine().charAt(0);

				System.out.print("What Distance Are You Shooting from? -->");
				int distance = keyboard.nextInt();

				shootingPhase(pickShip(from), pickShip(to), arc, distance);

				System.out.print(playerJPN + ", do you want to strike another attack? (y/n) -->");
				isFinished = !util.yesOrNo();
			} while (!isFinished) ;
		} // end of japanese turn
	}

	public static void shootingPhase(Ship attacker, Ship defender, char arc, int distance) {
		System.out.println(LINES);
		int counter =  defender.getClassTypeModifier();
		String side = "at\nthe ";
		if (arc == 'f') {
			side = "from the front\nto the ";
		} else if (arc == 'p') {
			side = "from the port side\nto the ";
		} else if (arc == 's') {
			side = "from the starboard side\nto the ";
		} else if (arc == 'a') {
			side = "from the aft\nto the";
		}
		System.out.println(attacker.getName() + " is shooting " + side  + defender.getName() + " over " + distance +"\".");
		System.out.println("Base Target Number ");
	}

	public static final String LINES = "---------------------------------";
	public static Scanner keyboard = new Scanner(System.in);
	public static Services util = new Services();
	static AmericanFleet americanFleet;
	static JapaneseFleet japaneseFleet;
	static String playerUSA;
	static String playerJPN;

	public static void main() {
		int roundCounter = 0;
		boolean gameOver = false;

		System.out.print(LINES + "\nEnter The Captain for the\nAmerican Fleet -->");
		playerUSA = keyboard.nextLine();

		System.out.print(LINES + "\nEnter The Captain for the\nJapanese Fleet -->");
		playerJPN = keyboard.nextLine();

		do {
			roundCounter++;
			System.out.println(LINES + "\nShooting Phase #"+roundCounter);

			System.out.print(LINES + "\nAre Either Countries Battleship's Shooting? (y/n) -->");
			if (util.yesOrNo()) battleShipShootingPhase();

			System.out.print(LINES + "\nAre Either Countries Cruiser's Shooting? (y/n) -->");
			if (util.yesOrNo()) battleShipShootingPhase();

			System.out.print(LINES + "\nAre Either Countries Destroyer's Shooting? (y/n) -->");
			if (util.yesOrNo()) battleShipShootingPhase();

			System.out.print("Playing Another Round? (y/n) -->");
			gameOver = !util.yesOrNo();
			System.out.println(LINES);
		} while (!gameOver);

		System.out.println("Game over");
	}

	class AmericanFleet {
		// Task Group 16.1
		// Ship SaltLakeCity = new Pensacola();
		public static Ship Bailey = new Benson("Bailey");
	}

	class JapaneseFleet {
		// Cruiser Force

		// Escorting Destroyers
		public static Ship Ikazuchi = new Akatsuki("Ikazuchi");
	}
} // end of KomandorskiIslands class