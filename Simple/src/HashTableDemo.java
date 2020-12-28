import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;


public class HashTableDemo {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(1, "jyo");
		ht.put(5, "phani");
		ht.put(1, "sunny");
		//HashTable does not allow even a single null key
//		ht.put(null, null);
		System.out.println(ht);
		
		Iterator i=ht.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(ht.keySet()+ht.get(5)+ht.values());
		}
		
		for(Map.Entry e:ht.entrySet()){
			System.out.println(e.getValue()+""+e.getKey());
		}
	}

}
