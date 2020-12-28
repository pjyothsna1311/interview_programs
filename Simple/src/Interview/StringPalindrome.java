package Interview;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		String s;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		s=sc.next();
		System.out.println(s);
		char c[]=s.toCharArray();
		for(int i=0,j=c.length-1;i<c.length/2;i++,j--){
			
			
			temp=c[i];
			c[i]=c[j];
			c[j]=temp;
		}
		c.toString();
		System.out.println(c);
		if(s.equals(c))
			System.out.println("palin");
		//System.out.println(p);
		/*if(s.equalsIgnoreCase(p))
			System.out.println("palin");*/
			
	}

}
