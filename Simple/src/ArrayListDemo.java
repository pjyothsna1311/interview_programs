import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Jyo");
		al.add("phani");
		al.add(2, "sunny");
		al.add("");
		al.add("");
		System.out.println(al);
		
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("papai");
		al1.add(1, "nanna");
		
		//Adding al1 into al array list
		al.addAll(al1);
		System.out.println(al);
		
		
		//removes all the elements of al except al1
		al.retainAll(al1);
		System.out.println(al);
		
		Teacher t1=new Teacher(20, "ravi");
		Teacher t2=new Teacher(10, "amma");
		Teacher t3=new Teacher(50,"nanna");
		//Arraylist can contain dup elements
		Teacher t4=new Teacher(50,"nanna");
		
		//Creating an arraylist of type teacher
		ArrayList<Teacher> al2=new ArrayList<Teacher>();
		al2.add(t1);
		al2.add(t2);
		
		//Creating an arraylist of type teacher but also initializig this arraylist with colection al2
		ArrayList<Teacher> al3=new ArrayList<Teacher>(al2);	
		al3.add(t3);
		al3.add(t4);
		
		//adding an obj at specified index
		al3.add(4, t4);
		System.out.println(al3);
		
		//Iterating 
		Iterator i=al1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		//Iterating teacher type arraylist
		Iterator i1=al2.iterator();
		while(i1.hasNext()){
			Teacher t=(Teacher)i1.next();
			System.out.println(t.name+""+t.rollno);
		}
		
		//for each
		for(String s:al){
			System.out.println(s);
		}
		
		for(Teacher teacher:al2){
			System.out.println(teacher.name+""+teacher.rollno);
		}
		
		//for each for Teacher type collection
		for(Teacher teacher1:al3){
			System.out.println(teacher1.name+""+teacher1.rollno);
		}
		
		System.out.println(al3.lastIndexOf(t4));
		System.out.println(al3.indexOf(t3));
		
		/*ListIterator list=al2.listIterator();
		while(list.hasPrevious()){
			Teacher teach=(Teacher)list.previous();
			System.out.println(teach.name);
		}*/
		
		ListIterator list=al1.listIterator();
		while(list.hasNext()){
			
			System.out.println(list.next());
		}
		
		
	}

}

class Teacher{
	
	int rollno;
	String name;
	Teacher(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
}
