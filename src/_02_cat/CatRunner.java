package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat cat = new Cat("Puddles");
	cat.meow();
	cat.printName();
	for(int i = 0;i<=8;i++) {
	cat.kill();}
}
}
