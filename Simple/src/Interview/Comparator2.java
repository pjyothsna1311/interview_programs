package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator2 {
	public static void main(String[] args) {
		ArrayList<Teacher2 > a=new ArrayList<>();
		Teacher2 t1=new Teacher2("jyo", 25, 10);
		Teacher2 t2=new Teacher2("phani", 20, 20);
		Teacher2 t3=new Teacher2("ravi", 28, 30);
		a.add(t1);
		a.add(t2);
		a.add(t3);
		System.out.println("before sorting"+a);
		Collections.sort(a, new Compatator_Name());
		System.out.println("after sorting"+a);
		System.out.println("before sorting"+a);
		Collections.sort(a, new Comparator_Age());
		System.out.println("after sorting"+a);
	}
}
class Teacher2{
	
	String name;
	int age;
	int id;
	public Teacher2(String name,int age,int id) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.id=id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+age+id;
	}
}
class Compatator_Name implements Comparator<Teacher2>{

	@Override
	public int compare(Teacher2 t1, Teacher2 t2) {
		// TODO Auto-generated method stub
		return t1.name.compareTo(t2.name);
	}
	
}
class Comparator_Age implements Comparator<Teacher2>{

	@Override
	public int compare(Teacher2 t1, Teacher2 t2) {
		// TODO Auto-generated method stub
		/*if(t1.age==t2.age)
			return 0;
		else if(t1.age>t2.age)
			return 1;
		else
			return -1;*/
		return t1.age - t2.age;
	}
	
}
