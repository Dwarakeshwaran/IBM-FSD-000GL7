package servlet.model;

public class Hero {
	
	private String name;
	private String hName;
	private int power;
	public Hero(String name, String hName, int power) {
		super();
		this.name = name;
		this.hName = hName;
		this.power = power;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	

}
