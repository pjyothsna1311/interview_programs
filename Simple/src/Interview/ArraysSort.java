package Interview;

import java.util.*;

public class ArraysSort {

	public static void main(String[] args) {
		Integer arr[]={2,3,4,1};
		System.out.println("before sorting");
		for(int i:arr){
			System.out.println(i);
		}
			//Arrays.sort(arr); // to sort in ascending order
			Arrays.sort(arr, new SortDec()); // to sort in desc order we need to override compare metod of comparator
			System.out.println("after sorting");
			for(int j:arr)
				System.out.println(j);

		Parents p1=new Parents("zjyo", 250);
		Parents p2=new Parents("ravi", 28);

		List<Parents> parentsList = new ArrayList<>();
		parentsList.add(p1);
		parentsList.add(p2);
		Collections.sort(parentsList,new ParentsSortAge());
		System.out.println("After sorting parents by age");
		for(Parents p: parentsList) {
			System.out.println(p.age);
		}

		System.out.println("After sorting parents by namd");
		Collections.sort(parentsList,new ParentsSortByName());
		for(Parents p: parentsList) {
			System.out.println(p.name);
		}
		}
		
	}
class SortDec implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return i2.compareTo(i1);
	}
	
}

class Parents{
	String name;
	int age;
	public Parents(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+age;
	}
}

class ParentsSortAge implements Comparator<Parents> {

	@Override
	public int compare(Parents o1, Parents o2) {
		return o1.age - o2.age;
	}
}

class ParentsSortByName implements Comparator<Parents> {

	@Override
	public int compare(Parents o1, Parents o2) {
		return o1.name.compareTo(o2.name);
	}
}
