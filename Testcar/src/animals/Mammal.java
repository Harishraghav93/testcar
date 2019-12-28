package animals;

public class Mammal implements Animal{
	
	public void eat() {
		System.out.println("Mammal eats");
	}
	
	public void travel() {
		System.out.println("Mammal travels");
	}
	
	public boolean lay_eggs() {
		return false;
	}

}
