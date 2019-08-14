package practice.Enumeration;


//enum is nothing but the user defined datatype
//Here the datatype is PowerLevel
//PowerLevel datartye has 4 power levels
//The values of powerlevels are given using the constructor
//the constructor of the enum is always private
public enum PowerLevel {
	NORMAL(100),
	SAIYAN(1000),
	SSJ2(5000),
	SSJ3(250000);
	
	private int power;
	
	private PowerLevel(int power) {
		this.power = power;
	}
	
	public int getPowerLevel() {
		return power;
	}

}
