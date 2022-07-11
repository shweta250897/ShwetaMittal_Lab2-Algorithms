package com.greatlearning.currencydenominations;

public class NotesCount {
	public static void numberOfDenomination(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];
		try {
			for(int i=0; i< notes.length; i++) {
				if(amount>=notes[i]) {
					notesCounter[i]= amount/notes[i];
					amount= amount - notes[i]* notesCounter[i];
				}
			}
			if(amount > 0) {
				System.out.println("Exact amount cannot be given with highest denomination");
			} else {
				System.out.println("Your payment approach inorder to give minimum number of notes will be");
				for(int i=0; i<notesCounter.length; i++) {
					if(notesCounter[i]!= 0) {
						System.out.println(notes[i] + ":" + notesCounter[i]);
					}
				}
			}
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage()+ "");
		}
	}

}
