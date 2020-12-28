package Interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	public static void main(String[] args) {
		String s1,s2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		s1=sc.nextLine();
		s2=sc.nextLine();
		StringBuilder s3=new StringBuilder(s2);
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));
		
		//Second sol for anagram
		/*for(char c:a){
			int index=s3.indexOf(""+c);
			if(index!=1){
				s3.deleteCharAt(index);
			}
		}
		if(s3.length()==0){
			System.out.println("anagram");
		}*/
	}

}
