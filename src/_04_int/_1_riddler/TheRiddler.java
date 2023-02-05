package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
      int score = 0; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
      String tomRiddle = JOptionPane.showInputDialog("How does Harry Potter get rid of a rash?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
     if (tomRiddle.equalsIgnoreCase("Quit-itch")) {
      JOptionPane.showMessageDialog(null, "Your answer is correct");
     
      }
		// 5. Otherwise, say "wrong" and tell them the answer
     else {
		JOptionPane.showMessageDialog(null, "Quit-itch");
	}
		// 6. Add some more riddles
     String gorilla = JOptionPane.showInputDialog("What do you call a gorilla that plays with clay?");
     if (gorilla.equalsIgnoreCase("Hairy Potter")) {
    	 JOptionPane.showMessageDialog(null, "Correct");
     			
	}
     else {
		JOptionPane.showMessageDialog(null, "Hairy Potter");
	}
		// 2. Make a pop up to show the score.
     JOptionPane.showMessageDialog(null, "Your score is" + score);
}
}

