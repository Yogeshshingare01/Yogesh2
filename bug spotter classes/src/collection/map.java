package collection;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("pincode", 431116);
		map.put("name", "dnyanu");
		map.put("district","sambhajinagar");
		
		System.out.println(map.get("pincode"));
		System.out.println(map.getOrDefault("city", "amravati"));
	}

}
