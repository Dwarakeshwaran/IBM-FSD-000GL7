package assignment.country_states_display;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String _state;
		String _country;
		String num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextLine();
		
		List<Country> cList = new ArrayList<Country>();
		
		for(int i=0 ; i<Integer.parseInt(num);i++) {
			
			_country = sc.nextLine();
			cList.add(new Country(_country));
			
//			_state = sc.nextLine();
			
		}

		System.out.println(cList);
	}

}
