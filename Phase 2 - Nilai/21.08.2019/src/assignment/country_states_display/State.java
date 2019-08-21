package assignment.country_states_display;

public class State implements Comparable{
	
	private String name;
	

	public State(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Object o) {
		
		return 0;
	}

}
