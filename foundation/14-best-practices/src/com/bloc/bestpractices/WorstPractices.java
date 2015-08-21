package com.bloc.bestpractices;

public class WorstPractices {

	/************************************************
	 *	ASSIGNMENT:
	 *	Fix code and comments below this block
	/************************************************/

	public static void main(String[] args) {
		int magicNumber = WorstPractices.magicNumberGenerator(false);
		magicNumber *= 5;
		if (magicNumber > 18) {
			while(magicNumber > 0){
			magicNumber--;
			}
		}
	}

// magicNumberGenerator
// this method takes in a single parameter, isTrue. 
// It calculates a magic number and 
// returns: a magical number
// a seed which helps generate the magic number
	private static int magicNumberGenerator(boolean isTrue){
		
			//Start off with one of these
		int magicInt = isTrue ? 34 : 21;
		float magicFloat = 0.5f;
		
		for (int i = 0; i < magicInt; i++) { 
			magicFloat *= magicInt;
		} 
	
		return (int)(magicFloat * magicInt);
	}

	/************************************************
	 *	ASSIGNMENT
	 *	Fix code and comments above this block
	/************************************************/
}
