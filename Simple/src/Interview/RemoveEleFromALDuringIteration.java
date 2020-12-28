package Interview;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEleFromALDuringIteration {
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		int size=al.size();
		System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext()){
			
			System.out.println(i.next());
			i.remove();
		}
		System.out.println(al);

		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(10);
		System.out.println(al2);
		for(int j =0;j<al2.size();j++){
			System.out.println(al2.get(j));

		}
		System.out.println(al2);


	}

}
