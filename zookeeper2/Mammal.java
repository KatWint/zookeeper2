package zookeeper2;

public class Mammal {
	protected int energyLevel=100;
	
	public Mammal() {
		
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("Present Energy " + energyLevel);
		return energyLevel;
	}
}

