package Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class RemoveValuesFromHashMap {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("java", 20);
		hm.put("c", 30);
		hm.put("sql",40);
		Set<Entry<String, Integer>> set=hm.entrySet();
		Iterator<Entry<String, Integer>> i=set.iterator();
		while(i.hasNext()){
			Entry<String, Integer> entry=i.next();
			Integer value=entry.getValue();
			if(value>30){
				i.remove();
			}
		}
		for(Entry<String, Integer> e:set){
			System.out.println(e.getValue());
		}
	}
}
