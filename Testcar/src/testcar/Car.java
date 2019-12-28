package testcar;

import animals.Animal;

public class Car implements Animal {
	
	private String doors;
	private String drivingstate;
	private String working;
	private int speed;
	
	public Car() {
		doors ="opened";
		
	}
	
	public Car(String doors, String drivingstate, int speed) {
		this.doors=doors;
		this.drivingstate=drivingstate;
		this.speed=speed;
		
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getDrivingstate() {
		return drivingstate;
	}
	public void setDrivingstate(String drivingstate) {
		this.drivingstate = drivingstate;
	}
	public String getWorking() {
		return working;
	}
	public void setWorking(String working) {
		this.working = working;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("Closed") ) {
		return "running";
		}
		else
			return "not running";
		
	}
	
	public void eat() {
		System.out.println("car dont eat");
	}
	
	public void travel() {
		System.out.println("car travel");
	}
	
	public boolean lay_eggs() {
		return false;
	}
	
	

}
