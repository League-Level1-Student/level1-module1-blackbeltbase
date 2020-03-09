package _06_duck;

public class DuckRunner {
public static void main(String[] args) {
	Duck daffy = new Duck("donuts",5);
	daffy.quack();
	daffy.waddle("forward");
	Chameleon chammy = new Chameleon(true,"cockroach and grasshopper", "palmtree");
	chammy.eat("cockroach");
	chammy.walk();
}
}
