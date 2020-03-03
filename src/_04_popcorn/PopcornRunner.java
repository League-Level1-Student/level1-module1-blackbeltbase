package _04_popcorn;

import javax.swing.JOptionPane;

//* Your mission and you have to accept it:
//	 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
//	 * The main method should create a bag of Popcorn and cook it in the microwave.
//	 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
//	 * Don't change the existing methods.
public class PopcornRunner {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	String numMinutes = JOptionPane.showInputDialog("How many minutes do you want to cook it for?");
	Popcorn popcorn = new Popcorn(flavor);
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(popcorn);
	int minutes = Integer.parseInt(numMinutes);
	microwave.setTime(minutes);
	microwave.startMicrowave();
	popcorn.eat();
}
}
