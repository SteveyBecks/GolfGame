package com.GolfGame;

import java.util.ArrayList;

public class Hole {
	
	
	// create a hole list with a spaces input
	public static ArrayList<String> setHole(int spaces) {
		String ball = "o";
		String flag = "4";
		
		ArrayList<String> hole = new ArrayList<String>();
		
		hole.add(ball);
		
		for (int i = 0; i < spaces; i++) {
			hole.add("_");
		}
		
		hole.add(flag);
		
		return hole;
	}
	
	//print which hole the user is on
	public static void printHoleNumber(int holeNumber) {
		System.out.println("Hole " + holeNumber + ":");
		System.out.println();
	}
	
	// print the hole list
	public static void printHole(ArrayList<String> hole) {
		
		//Get distance from ball to hole
		int count = 0;
		int count2 = 0;
		
		for (int i = 0; i < hole.size(); i++) {
			System.out.print(hole.get(i) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < hole.size(); i++){
			count++;
			if (hole.get(i).equals("o")) {
				count2 = hole.size() - count;
			}
		}
		
		System.out.println("Distance to hole: " + count2);
		System.out.println();
		
	}
}
