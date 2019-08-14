package practice.Enumeration;



public class Hero {
	private String name;
	private PowerLevel power;
	
	public void givePower(String name,PowerLevel power) {
		this.name = name;
		this.power = power;
		
	}
	
	public String getDetails() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("He is " + name + "\n");
		sb.append(name + "'s Power Level is " + power.getPowerLevel() + "\n");
		sb.append(name + "'s in " + power +" Form\n");
		sb.append("and....\n\n\n");
		sb.append(name + " is F'king Unbeatable");
		return sb.toString();
	}

}
