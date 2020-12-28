package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfOccurenceOfGivenCharInString {
	
	public static void main(String[] args) {

		//One way
		String s;
		int count=0;
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char[] ch=s.toCharArray();
		char c;
		System.out.println("enter the character");
		c=sc.next().charAt(0);
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==c){
				count++;
			}
		}
		System.out.println(count);

		//Two way
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i = 0; i < ch.length ; i++) {
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i],hm.get(ch[i])+1);
			}
			else {
				hm.put(ch[i],1);
			}
		}

		System.out.println("count of occurences of a particular char  " + "  " + c + "  " + hm.get(c) );
		
	}

}
