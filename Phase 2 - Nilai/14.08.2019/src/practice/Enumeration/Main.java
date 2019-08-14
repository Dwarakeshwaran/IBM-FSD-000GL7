package practice.Enumeration;

public class Main {

	public static void main(String[] args) {
		PowerLevel pl = PowerLevel.NORMAL;
		System.out.println(pl.getPowerLevel());
		
		Hero goku = new Hero();
		goku.givePower("Goku", PowerLevel.SSJ3);
		System.out.println(goku.getDetails());
		
	}

}
