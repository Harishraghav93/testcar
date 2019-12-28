package testcar;

import animals.Animal;

public class Lion implements Animal {
	
	public void eat() {
		System.out.println("lion eat");
	}
	
	public void travel() {
		System.out.println("lion travel");
	}
	
	public boolean lay_eggs() {
		return false;
	}

}
