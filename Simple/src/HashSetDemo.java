import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;


public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> set=new HashSet<String>();
		set.add("amaleswari");
		set.add("jyo");
		set.add("jyo");
		set.add("phani");
		set.add("papai");
		set.add("");
		set.add("");
		System.out.println(set.contains(""));
		
		System.out.println(set);
		
		Iterator i=set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		HashSet<String> set1=new HashSet<String>(1);
		set1.add("jyo");
		set1.addAll(set);
		System.out.println(set1.size());
		
		HashDemo h1=new HashDemo("jyo", 20);
		HashDemo h2=new HashDemo("jyo", 20);
		HashSet< HashDemo> hash=new HashSet<HashDemo>();
		System.out.println(hash.add(h1));
		System.out.println(hash.add(h2));
		
		Iterator i1=hash.iterator();
		while(i1.hasNext()){
			HashDemo hd=(HashDemo)i1.next();
			System.out.println(hd.name+""+hd.num);
		
	}
		
		System.out.println(h1.equals(h2));
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h1==h2);
		
		for(HashDemo hh:hash){
			System.out.println(hh.name+""+hh.num);
		}
		
		HashSet<Object> hs3=new HashSet<Object>();
		hs3.add("Papai");
		hs3.add(20);
		System.out.println(hs3);
		
		
		
}

}
class HashDemo{
	String name;
	int num;
	
	@Override
	 public int hashCode() {
	  return num;
	 }
	
	@Override
	 public boolean equals(Object obj) {
	  HashDemo hash=(HashDemo)obj;
	  return(num==hash.num);
	 }
	public HashDemo(String name,int num){
		this.name=name;
		this.num=num;
	}
}

