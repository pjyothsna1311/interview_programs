package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveEleFromArray {
	
	public static void main(String[] args) {
		Integer [] a={1,10,30,2,5};
		int del=5;
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(a));
		Iterator i=al.iterator();
		while(i.hasNext()){
			int search=(int)i.next();
			if(search==del){
				i.remove();
			}
				
			
				
		}
		System.out.println(al);
		Integer[] b=new Integer[al.size()];
		b=al.toArray(b);
		for(int j=0;j<b.length;j++){
			System.out.println(b[j]);
		}
		
		
		
	}
}