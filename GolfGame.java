package com.GolfGame;

import java.util.ArrayList;
import java.util.Random;

public class GolfGame {
	
	
	public static void main(String[] args) throws Exception {

		GameStart.startingMessage();
		
		//create and initialize holes
		ArrayList<String> hole1 = Hole.setHole(9);
		
		Hole.printHoleNumber(1);
		Hole.printHole(hole1);
	}

}
