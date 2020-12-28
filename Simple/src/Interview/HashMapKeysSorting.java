package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapKeysSorting {

	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<>();
		h.put(20, "jyo");
		h.put(25, "Ravi");
		h.put(10, "phani");
		Set<Entry<Integer, String>> hs=h.entrySet();
		ArrayList<Entry<Integer, String>> al=new ArrayList<>(hs);
		System.out.println("before sorting");
		for(Map.Entry<Integer, String> itr:al)
			System.out.println(itr.getKey()+itr.getValue());
			
		Collections.sort(al, new Comparator_HashKey());
		System.out.println("after sorting");
		/*Iterator i=h.entrySet().iterator();
		while(i.hasNext()){
			System.out.println("sort");
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+""+entry.getValue());*/
		for(Map.Entry<Integer, String> itr:al)
			System.out.println(itr.getKey()+itr.getValue());
		
		HashMap<Plants, Integer> hm1=new HashMap<>();
		Plants p1=new Plants("rose", 20);
		Plants p2=new Plants("jasmine", 10);
		hm1.put(p1, 2);
		hm1.put(p2, 10);
		Set<Entry<Plants, Integer>> set=hm1.entrySet();
		List<Entry<Plants, Integer>> list=new ArrayList(set); 
		System.out.println("Before sorting");
		for(Map.Entry<Plants, Integer> itr1:list)
			System.out.println(itr1.getKey()+""+itr1.getValue());
		//Collections.sort(list, new Comparator_CustomKey());
		
		
		
		}
	}

class Comparator_HashKey implements Comparator<Map.Entry<Integer, String>>{

	

	@Override
	public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
		// TODO Auto-generated method stub
		return (e1.getKey().compareTo(e2.getKey()));
	}
	
}

class Plants{
	String name;
	int age;
	Plants(String name,int age){
		this.name=name;
		this.age=age;
	}
}


class Comparator_CustomKey implements Comparator<Map.Entry<Plants, String>>{

	@Override
	public int compare(Entry<Plants, String> p3, Entry<Plants, String> p4) {
		// TODO Auto-generated method stub
		Plants p=(Plants)p3.getKey();
		Plants pp=(Plants)p4.getKey();
		
		return p.name.compareTo(pp.name);
	}
	
}
