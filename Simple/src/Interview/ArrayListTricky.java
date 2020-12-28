package Interview;

import java.util.ArrayList;

public class ArrayListTricky {
	
	public static void main(String[] args) {
		
		final ArrayList<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(40);
		
		ArrayList<Integer> al2=new ArrayList<>(al);	
		al.add(60);
		System.out.println(al);
		System.out.println(al2);

		ArrayList<Integer> al3=new ArrayList<>();
		al3.add(100);

		//Final array values can be modified but not the reference. Arrays are objects and obj vars are always references in java
		//(here al is the reference in java) So, when we declare an object variable as final, it means that the variable cannot be changed to refer to anything else.
		//al = al3;

		//this works fine because al2 is not final
		al2 = al3;
		System.out.println(al2);


	}

}
