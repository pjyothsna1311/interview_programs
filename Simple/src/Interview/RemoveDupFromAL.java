package Interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupFromAL {
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(10);
		Set<Integer> s=new HashSet<>(al);
		System.out.println(s);
		
	}

}
