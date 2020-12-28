import java.util.ArrayList;
import java.util.Collections;


public class Comparable_Demo {

	public static void main(String[] args) {
		ArrayList<Tree> al=new ArrayList<>();
		Tree t1=new Tree("guava",3,30);
		Tree t2=new Tree("papaya",1,10);
		Tree t3=new Tree("melon",4,100);
		al.add(t1);
		al.add(t2);
		al.add(t3);
		Collections.sort(al);
		for(Tree tt:al){
			System.out.println(tt.name+""+tt.num+""+tt.age);
		}
	}
}

class Tree implements Comparable<Tree>{
	String name;
	int num;
	int age;
	
	Tree(String name,int num,int age){
		this.name=name;
		this.num=num;
		this.age=age;

	}

	@Override
	public int compareTo(Tree t) {
		// TODO Auto-generated method stub
		if(age==t.age)
			return 0;
		else if(age>t.age)
			return 1;
		else
			return -1;
	}
	
	
}
