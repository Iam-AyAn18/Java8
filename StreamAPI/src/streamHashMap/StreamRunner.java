package streamHashMap;

import java.util.HashMap;
import java.util.Map;

public class StreamRunner {

	public static void main(String[] args) {

		Map<Integer,String> hmap = new HashMap<>();
		
		hmap.put(1, "Ayan");
		hmap.put(2, "Sayan");
		hmap.put(3, "Pranay");
		hmap.put(4, "Debu");
		hmap.put(5, "Chandi");
		hmap.put(6, "SK");
		
		System.out.println(hmap);
		
		hmap.entrySet().stream().filter(s->s.getKey()==1 && s.getValue()=="Ayan").forEach(System.out::println);
	}

}
