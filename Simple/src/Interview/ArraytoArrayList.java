package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArraytoArrayList {
	public static void main(String[] args) {
		Integer a[]={10,10,30};
		int[] b={20,40,60};
		
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(a));
		
		System.out.println(al);
		HashSet< Integer> hs=new HashSet<>(al);
		System.out.println(hs);
		
		}
	}


