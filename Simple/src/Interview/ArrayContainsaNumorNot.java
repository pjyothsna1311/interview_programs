package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayContainsaNumorNot {
public static void main(String[] args) {


	int a[]={100,20,30};
	int n=5;
	/*for(int i=0;i<a.length-1;i++){
		if(a[i]==n)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}*/
	List list = new ArrayList<>();
	list.add("hello") ;
	list.add(2);
	System.out.println(list.get(0) instanceof  Object);
	int x= 5;
	x= 100000;
	System.out.println(x);
	Arrays.sort(a);
	for(int j=0;j<a.length;j++){
		System.out.println(a[j]);
	}


}
}
