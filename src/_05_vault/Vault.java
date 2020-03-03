package _05_vault;

public class Vault {

	private int code;
	Vault(int code){
		this.code = code;
	System.out.println("vault has been created");
	}
	
	public void tryCode(int guess) {
		System.out.println("Code being tried: "+guess);
		if(guess == code) {
			System.out.println("James Bond cracked the code!");
		}
		else {
			System.out.println("Access denied. Wrong code.");
		}
	}
	
	
}

class JamesBond{
	
	JamesBond(){
		System.out.println("James Bond has been created.");
	}
	
	public void findCode(int howLargeMaxCode, int code) {
		for(int i = 0; i<=howLargeMaxCode; i++) {
			System.out.println("finding code #"+i);
			if(i == code) {
				System.out.println("the code is "+i+".");
				break;
			}
			else {
				System.out.println("Code #"+i+" terminated. Wrong code.");
			}
		}
	}
}


