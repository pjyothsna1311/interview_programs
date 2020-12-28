import java.util.ArrayList;
import java.util.Collections;


public class Collections_Comparision {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("phani");
		al.add("amaleswari");
		al.add("ravi");
		Collections.sort(al);
		System.out.println(al);
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(Integer.valueOf(2));
		al1.add(Integer.valueOf(0));
		al1.add(230);
		Collections.sort(al1);
		System.out.println(al1);
	}

}
