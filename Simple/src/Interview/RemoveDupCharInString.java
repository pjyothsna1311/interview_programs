package Interview;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupCharInString {
	
	public static void main(String[] args) {
		String s="banana";
		Set<Character> set=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		char[] ch=s.toCharArray();
		for(char search:ch){
			if(!set.contains(search)){
				set.add(search);
			sb.append(search);
			}
			/*else{
				set.add(search);
				sb.append(search);
			}*/
		}
		System.out.println(set+""+sb);

		String s1 = "amma";
		Set<Character> set1 = new HashSet<>();
		char ch1[] = s1.toCharArray();
		for(char character: ch1){
			set1.add(character);
		}
		System.out.println(set1.toString());





}
}

