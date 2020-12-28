package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapKeysAndValuesSorting {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("xxx", 50);
		hm.put("java", 20);
		hm.put("c", 30);
		hm.put("abc", 40);
		hm.put("def", 50);
		Set<Entry<String, Integer>> set=hm.entrySet();
		List<Entry<String, Integer>> list=new ArrayList<>(set);
		System.out.println("before sorting");
		for(Entry<String,Integer> entry:set){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		Collections.sort(list, new HashKeySort());
		System.out.println("after sorting");
		for(Entry<String, Integer> entry:list){
			System.out.println(entry.getKey());
		}
		Collections.sort(list, new HashValueSort());
		System.out.println("after sorting");
		for(Entry<String, Integer> entry:list){
			System.out.println(entry.getValue());
		}
		
		
	}

}

class HashKeySort implements Comparator<Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
		// TODO Auto-generated method stub
		return e1.getKey().compareTo(e2.getKey());
	}
	
}

class HashValueSort implements Comparator<Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
		// TODO Auto-generated method stub
		return e1.getValue().compareTo(e2.getValue());
	}
	
}
