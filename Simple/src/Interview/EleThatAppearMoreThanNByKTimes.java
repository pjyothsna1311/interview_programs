package Interview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EleThatAppearMoreThanNByKTimes {
	
	public static void main(String[] args) {
		int[] a={3,1,2,2,1,2,3,3};
		int k;
		System.out.println("enter k value");
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		int result=a.length/k;
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i:a){
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else
				hm.put(i, 1);
		}
		Set<Entry<Integer, Integer>> set=hm.entrySet();
		for(Map.Entry<Integer, Integer> search:set){
			if(search.getValue()>result){
				System.out.println(search);
			}
		}
	}

}
