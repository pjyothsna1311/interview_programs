import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Comparator_demo {

	public static void main(String[] args) {
		ArrayList<Animals> al=new ArrayList<>();
		Animals aa=new Animals("donkey", 20, 1);
		Animals ab=new Animals("pig", 0, 2);
		al.add(aa);
		al.add(ab);
		Collections.sort(al,new NameComparator());
		Iterator i=al.iterator();
		while(i.hasNext()){
			Animals a=(Animals)i.next();
			System.out.println(a.name+""+a.age+""+a.num);
		}
		
		Collections.sort(al,new AgeComparator());
		for(Animals ac:al){
			System.out.println(ac.name+""+ac.age+""+ac.num);
		}
	}
}

class Animals {
	
	String name;
	int age;
	int num;
	public Animals(String name,int age,int num) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.num=num;
	}

	

	
}

class AgeComparator implements Comparator<Animals>{

	@Override
	public int compare(Animals a1, Animals a2) {
		// TODO Auto-generated method stub
		if(a1.age==a2.age)
			return 0;
		else if(a1.age>a2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Animals>{

	@Override
	public int compare(Animals a1, Animals a2) {
		// TODO Auto-generated method stub
		return a1.name.compareTo(a2.name);
	}
	
	
}

