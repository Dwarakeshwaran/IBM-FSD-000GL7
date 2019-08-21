package assignment.country_states_display;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Country {

	private String name;
	public List stateList = new ArrayList();
	
	public Country(String name) {
		super();
		this.name = name;
	}

	public Country() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addState(String statename) {
		this.stateList.add(statename);
		
	}
	
	public void getStateList() {
		Collections.sort(this.stateList);
		
		Iterator iterator = this.stateList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
	
}
