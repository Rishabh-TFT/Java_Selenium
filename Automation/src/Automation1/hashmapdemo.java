  package Automation1;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmapdemo {


	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<String, String>();
		
		hash.put("name", "Rishabh");
		hash.put("number", "9870");
		hash.put("state", "delhi");
		
		//System.out.println(hash.get("name"));
		
		/*Iterator<String> iterator = hash.keySet().iterator();
		
		while(iterator.hasNext()) {
			
			String key = iterator.next();
			System.out.println(key + "=" + hash.get(key));
			*/
		
		for(Entry<String, String> entry : hash.entrySet()){
			
			System.out.println(entry.getKey() + "=" + entry.getValue());
			
			
		}
 

	}

} 