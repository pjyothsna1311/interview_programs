import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> h=new LinkedHashSet<String>();
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("jyo");
		lh.add("phani");
		lh.add("jyo");
		lh.add("Ravi");
		System.out.println(lh);
		LinkedDemo hd1=new LinkedDemo("jyo", 20);
		LinkedDemo hd2=new LinkedDemo("jyo", 20);
		LinkedHashSet<LinkedDemo> lhs=new LinkedHashSet<LinkedDemo>();
		lhs.add(hd1);
		lhs.add(hd2);
		
		Iterator i=lhs.iterator();
		while(i.hasNext()){
			LinkedDemo ld=(LinkedDemo)i.next();
			System.out.println(ld.name+""+ld.num);
		}
	}
}

class LinkedDemo
{
	String name;
	int num;
	
	@Override
	 public int hashCode() {
	  final int prime = 31;
	  int result = 1;
	  result = prime * result + ((name == null) ? 0 : name.hashCode());
	  return result;
	 }
	
	@Override
	 public boolean equals(Object obj) {
	  if (this == obj)
	   return true;
	  if (obj == null)
	   return false;
	  if (getClass() != obj.getClass())
	   return false;
	  LinkedDemo other = (LinkedDemo) obj;
	  if (name == null) {
	   if (other.name != null)
	    return false;
	  } else if (!name.equals(other.name))
	   return false;
	  return true;
	 }
	public LinkedDemo(String name,int num) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.num=num;
	}
}
