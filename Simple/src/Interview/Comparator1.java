package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator1 {
	
	public static void main(String[] args) {
		ArrayList<Teacher > a=new ArrayList<>();
		Teacher t1=new Teacher("jyo", 25, 10);
		Teacher t2=new Teacher("phani", 20, 20);
		Teacher t3=new Teacher("ravi", 28, 30);
		a.add(t1);
		a.add(t2);
		a.add(t3);
		System.out.println("before sorting"+a);
		Collections.sort(a, new Teacher());
		System.out.println("after sorting"+a);
	}
}

/* Class for single sorting only*/
class Teacher implements Comparator<Teacher>{
	
	String name;
	int age;
	int id;
	public Teacher(String name,int age,int id) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.id=id;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Teacher t1, Teacher t2) {
		// TODO Auto-generated method stub
		return t1.name.compareTo(t2.name);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+age+id;
	}
	
}
