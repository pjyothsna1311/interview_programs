package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepCharInString {
	public static void main(String[] args) {
		String s;
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char[] word=s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<>();
		for(Character ch:word){
			if(hm.containsKey(ch))
				hm.put(ch, hm.get(ch)+1);
			else
				hm.put(ch, 1);
			
		}
		for(int i=0;i<word.length;i++){
			char first=s.charAt(i);
			if(hm.get(first)==1){
				System.out.println(first);
				break;
			}
				
		}
			
		}
	}


