package _06_duck;

public class Duck {
	private String favoriteFood;
	private int numberOfFriends;
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
      	System.out.println("Duck has been created.");
      	System.out.println("The duck has "+numberOfFriends+" friends.");
      	System.out.println("Its favorite food is "+favoriteFood+".");
}
	public void quack() {
		System.out.println("QUACK!");
	}
	public void waddle(String direction) {
		System.out.println("The duck waddles to the "+direction+".");
	}
	
}

class Chameleon{
	private String diet;
	private String plant;
	Chameleon(boolean hornOrNot, String diet, String plantBlend){
		this.diet = diet;
		this.plant = plantBlend;
		System.out.println("Chameleon has been created.");
		if(hornOrNot) {
			System.out.println("The chameleon has a/many horn(s).");
		}
		System.out.println("It likes eating "+diet+"!");
		System.out.println("It is as still as a rock and looks like a "+plantBlend+".");
	}
	
	public void eat(int chosenBug) {
		System.out.println("The chameleon thwips its toungue out and eats "+chosenBug+".");
	}
	public void walk() {
	   System.out.println("The chameleon moves like a "+plant+" in the wind.");
	}
}
