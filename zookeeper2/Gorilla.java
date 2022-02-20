package zookeeper2;

public class Gorilla extends Mammal {

	public Gorilla() {
		
	}
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}

	public void throwSomething() {
		System.out.println("It is now up in the air");
		energyLevel -=5;
	}
	
	public void eatBananas() {
		System.out.println("This was really yummy!!");
		energyLevel +=10;
	}
	
	public void climb() {
		System.out.println("I am now at the top!");
		energyLevel -=10;
	}
}

