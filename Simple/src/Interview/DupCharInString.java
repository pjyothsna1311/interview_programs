package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DupCharInString {
	
	static void dup(String word){
		
		char c[]=word.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<>();
		for(Character ch:c){
			if(hm.containsKey(ch))
				hm.put(ch, hm.get(ch)+1);
			else
				hm.put(ch, 1);
			
		}
		Set<Entry<Character, Integer>> entryset=hm.entrySet();
		for(Map.Entry<Character, Integer> map:entryset){
			if(map.getValue()>1){
				System.out.println(map.getKey()+""+map.getValue());
			}
		}
		
		
		// to remove dup charcters
		/*Iterator<Entry<Character, Integer>> entry=entryset.iterator();
		while(entry.hasNext()){
			Entry<Character, Integer> dup=entry.next();
			Integer num=dup.getValue();
			if(num>1){
				entry.remove();
			}
		}*/
		
		
	}
	public static void main(String[] args) {
		
		dup("java");
		dup("ravikumar");
		dup("aaaaa");
		
	}
}




