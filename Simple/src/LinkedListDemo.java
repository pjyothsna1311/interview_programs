import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("jyo");
		ll.add("");
		
		//Linked list that is initilalized with another collection ll
		LinkedList<String> ll1=new LinkedList<String>(ll);
		ll1.add(1, "phani");
		System.out.println(ll1);
		
		//LL can contain dup elements
		ll1.addAll(ll);
		System.out.println(ll1);
		ll1.addFirst("Ravi");
		System.out.println(ll1);
		System.out.println(ll1.containsAll(ll));
		//System.out.println(ll1.descendingIterator());
		ll1.set(2, "sunny");
		System.out.println(ll1);
		
		ListIterator list1=ll1.listIterator();
		while(list1.hasPrevious()){
			System.out.println(list1.previous());
		}
		
		Jyo p1=new Jyo("jyo",20);
		Jyo p2=new Jyo("sunny",30);
		LinkedList<Jyo> l=new LinkedList<Jyo>();
		l.add(p1);
		l.add(p2);
		
		Iterator i=l.iterator();
		while(i.hasNext()){
			Jyo j=(Jyo)i.next();
			System.out.println(j.id+""+j.name);
		}
		
		for(Jyo j1:l){
			System.out.println(j1.id);
		}
		
		ListIterator list=l.listIterator();
		while(list.hasPrevious()){
			Jyo j1=(Jyo)list.previous();
			System.out.println(j1.id);		
		}
		 
		
		System.out.println("hi");
		
		
		
	}

}

class Jyo{
	
	String name;
	int id;
	Jyo(String name,int id){
		this.name=name;
		this.id=id;
	}
}

