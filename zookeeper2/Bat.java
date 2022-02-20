package zookeeper2;

public class Bat extends Gorilla {

	public Bat() {
		energyLevel = 300;
	}
	public void fly() {
		System.out.println("SWOOSH");
		energyLevel-=50;
	}
	
	public void eatHumans() {
		System.out.println("And then there was nothing left");
		energyLevel +=25;
	}
	
	public void attackTown() {
		System.out.println("The sounds of screaming as fire blazes");
		energyLevel -=100;
	}
}
