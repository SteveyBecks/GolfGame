package com.GolfGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;;

public class GameStart {
	
	public static void startingMessage() throws IOException {
		
		//Starting Message
		
		System.out.println("Welcome to the Golf Game!");
		System.out.println();
		System.out.print("The object of the game is to get the ball in the hole in as few ");
		System.out.println("strokes as possible.");
		System.out.println();
		System.out.println("The rules are as follows: ");
		System.out.println();
		System.out.println("1. The current hole will be displayed in the console");
		System.out.println("2. The ball will be indicated by the letter \"o\"");
		System.out.println("3. The pin/flag, or hole, will be indicated with the number \"4\"");
		System.out.print("4. The number of spaces you will need the ball to travel will be ");
		System.out.println("indicated by the \"_\" symbol");
		System.out.println("5. Choose the correct club in order to get the "
							+ "ball into the hole");
		System.out.println();
		System.out.println("Note:");
		System.out.println("Each club can hit the ball a specific distance: ");
		System.out.println();
		System.out.println("The \"Driver\" will hit the ball between 4 and 6 spaces");
		System.out.println("The \"Iron\"  will hit the ball between 2 and 4 spaces");
		System.out.println("The \"Putter\" will always hit the ball 1 space");
		System.out.println();
		System.out.println("Hitting the ball over the hole will result in a penalty stroke and ");
		System.out.println("the ball will be placed at the spot where you originally hit it from");
		System.out.println();
		System.out.println("Good Luck!");
		System.out.println();
		System.out.println("Are you ready to play?");
		
		
		//User input to check if ready to play
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		String areYouReady = null;
		
		do {
			
			System.out.println("(type \"yes\" or \"no\")");
			
			areYouReady = r.readLine().toLowerCase();
			
			if (areYouReady.equals("yes")) {
				
				for (int i = 0; i < 80; i++) {
					System.out.println();
				}
			}
			
			else if (areYouReady.equals("no")) {
				System.out.println("OK, Goodbye!");
				System.exit(0);
			}
			
		} while (!areYouReady.equals("yes"));
		
	}

}
