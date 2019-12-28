package testcar;



public class Main {
	public static void main(String[] args) {
		
		Car tes = new Car();
		tes.eat();
		tes.travel();
		boolean har;
		har=tes.lay_eggs();
		System.out.println("car lay eggs-"+har);
		
		Lion li = new Lion();
		li.eat();
		li.travel();
		
		Car obj = new Car("Closed","on",50);
		System.out.println(obj.run());
		
		Car res = new Car("open","off",0);
		System.out.println(res.run());
		
		
		
		obj.setDoors("Closed");
		System.out.println(obj.getDoors());
		
		obj.run();
		System.out.println(obj.run());
		
		obj.setDrivingstate("seated");
		System.out.println(obj.getDrivingstate());
	}

}
