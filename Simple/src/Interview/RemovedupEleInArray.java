package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class RemovedupEleInArray {
	public static void main(String[] args) {
		int a[]={10,20,10,30,50,10,50};
		int n=a.length;
		Arrays.sort(a);
		int temp[]=new int[n];
		int previous=a[0];
		temp[0]=previous;
		for(int i=0;i<n;i++){
			int ch=a[i];
			if(previous!=ch){
				temp[i]=ch;
			}
			previous=ch;
		}
		for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
		
		/*
		int j=0;
		for(int i=0;i<a.length-1;i++)
			if(a[i]!=a[i+1])
				a[j++]=a[i];
		
		a[j++]=a[a.length-1];
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);*/
		
	
//Second solution					
			
	/*HashMap<Integer, Integer> hm=new HashMap<>();
	for(int i:a){
		if(hm.containsKey(i)){
			hm.put(i, hm.get(i)+1);
		}
		else{
			hm.put(i, 1);
		}
		
	}
	
	Iterator<Entry<Integer, Integer>> i=hm.entrySet().iterator();
	while(i.hasNext()){
		Entry<Integer, Integer> entry=i.next();
		int j=entry.getValue();
		if(j>1){
			i.remove();
		}
			
	}
	for(Entry<Integer, Integer> k:hm.entrySet()){
		System.out.println(k.getKey()+""+k.getValue());
	}
	
	*/
		
	}

}
