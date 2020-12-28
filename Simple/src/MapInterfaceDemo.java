import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapInterfaceDemo {
	
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		//HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(20, "jyo");
		map.put(21, "jyo");
		
		map.put(null, null);
		map.put(30, "phani");
		//map.put(20, "jyo");
		System.out.println(map);
		Set set=map.keySet();
		Iterator i=set.iterator();
		while(i.hasNext()){
			Object key=i.next();
			System.out.println("keys are" +"  "+map.get(key)+map.containsKey(key)+map.containsValue("jyo")+map.entrySet()+map.keySet()+map.values());
		}
		
		for(Map.Entry<Integer, String> m:map.entrySet()){
			System.out.println(m.getValue()+m.getKey());
		}
		
		Iterator i1=map.entrySet().iterator();
		while(i1.hasNext()){
			Map.Entry entry=(Map.Entry)i1.next();
			System.out.println(map.keySet()+""+map.values()+entry.getKey()+entry.getValue());
		}
		
		HashMap<Integer, Students> map1=new HashMap<Integer,Students>();
		Students s1=new Students(20, "Ravi");
		Students s2=new Students(30, "Kumar");
		map1.put(20, s1);
		map1.put(30, s2);
		
		Iterator itr=map1.entrySet().iterator();
		
		
		while(itr.hasNext()){
			
			//System.out.println("hi");
			Map.Entry entry1=(Map.Entry)itr.next();
			//Students s=(Students)itr.next();
			Students s=(Students) entry1.getValue();
			System.out.println(entry1.getKey()+""+s.id+s.name);
		}
		
		for(Map.Entry entry2:map1.entrySet()){
			Students s3=(Students)entry2.getValue();
			System.out.println(entry2.getKey()+""+s3.id+s3.name);
		}
	}
}
class Students{
	int id;
	String name;
	Students(int id,String name){
		this.id=id;
		this.name=name;
	}
}
