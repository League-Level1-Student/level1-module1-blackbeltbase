package _05_vault;

import java.util.Random;

public class VaultRunner {
public static void main(String[] args) {
	Random ranCode = new Random();
	int randomCode = ranCode.nextInt(101);
	System.out.println(randomCode);
	int maxValueCode = 100;
	Vault vault = new Vault(randomCode);
	JamesBond james = new JamesBond();
	james.findCode(maxValueCode,randomCode);
	vault.tryCode(randomCode);
}
}
