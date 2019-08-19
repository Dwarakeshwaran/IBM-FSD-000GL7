package map.practice;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Name", "Dwaki");
		map.put("CodeName", "Kettavan");
		map.put("CodeNumber", "007");
		
		System.out.println(map.entrySet());
		map.put("Name", "Suman");
		System.out.println(map.entrySet());

	}

}
