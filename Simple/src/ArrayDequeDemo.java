import java.util.ArrayDeque;


public class ArrayDequeDemo {
	public static void main(String[] args) {

		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.add("Ravi");
		ad.add("Jyo");
		ad.add("Jyo");
		ad.add("Ravi");
		
		//Can't have null values
		//ad.add(null);
		System.out.println(ad);
		
		ArrayDeque<Subject> ad1=new ArrayDeque<Subject>();
		ad1.add(new Subject("jyo", 20));
		ad1.add(new Subject("jyo", 20));
		
		for(Subject s:ad1){
			System.out.println(s.name+"   "+s.id);
		}
		
	}

}

class Subject{
	String name;
	int id;
	Subject(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	/*Even if we override equals() and hashcode() ArrayDeque can have dup elements*/
	@Override
	 public boolean equals(Object obj) {
	  if (this == obj)
	   return true;
	  if (obj == null)
	   return false;
	  if (getClass() != obj.getClass())
	   return false;
	  Subject other = (Subject) obj;
	  if (name == null) {
	   if (other.name != null)
	    return false;
	  } else if (!name.equals(other.name))
	   return false;
	  return true;
		
		/*if(this.id==s.id)
			return true;
		else*/
	 }
	
	@Override
	 public int hashCode() {
	  final int prime = 31;
	  int result = 1;
	  result = prime * result + ((name == null) ? 0 : name.hashCode());
	  return result;
	 }
}
