package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList {
	
	public static void main(String[] args) {
		Zoo z1=new Zoo(10,"zebra");
		Zoo z2=new Zoo(5,"peacock");
		Zoo z3=new Zoo(100,"tiger");
		Zoo z4=new Zoo(50,"ant");
		ArrayList<Zoo> al=new ArrayList<>();
		al.add(z1);
		al.add(z2);
		al.add(z3);
		al.add(z4);
		System.out.println("before sorting");
		for(Zoo z:al){
			System.out.println(z.age+""+z.name);
		}
		Collections.sort(al);
		
		System.out.println("after sorting");
		for(Zoo z:al){
			System.out.println(z.age+""+z.name);
		}
		
		Collections.sort(al, new AgeComparator());
		
		System.out.println("after sorting");
		for(Zoo z:al){
			System.out.println(z.age+""+z.name);
		}
		
		
	}

}

class Zoo implements Comparable<Zoo>{
	int age;
	String name;
	Zoo(int age,String name){
		this.age=age;
		this.name=name;
		
	}
	
	 // To Sort based on name
	/*@Override
	public int compareTo(Zoo z1) {
		// TODO Auto-generated method stub
		return this.name.compareTo(z1.name);
	}*/
	
	// To sort based on Age
	@Override
	public int compareTo(Zoo z1) {
		// TODO Auto-generated method stub
		if(this.age==z1.age)
			return 0;
		else if(this.age>z1.age)
			return 1;
		else 
			return -1;
	}
	
	
}

class AgeComparator implements Comparator<Zoo>{

	@Override
	public int compare(Zoo z1, Zoo z2) {
		// TODO Auto-generated method stub
		if(z1.age==z2.age)
			return 0;
		else if(z1.age>z2.age)
			return 1;
		else 
			return -1;
	}
	
}
