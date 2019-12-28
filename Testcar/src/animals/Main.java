package animals;



public class Main {

	public static void main(String[] args) {
		Fish obj = new Fish();
		obj.eat();
		obj.travel();
		boolean res;
		res=obj.lay_eggs();
		System.out.println("Fish lay eggs"+res);
		
		Mammal mam = new Mammal();
		mam.eat();
		mam.travel();
		boolean tes;
		tes=mam.lay_eggs();
		System.out.println("Mammals lay eggs"+tes);
	}
}
