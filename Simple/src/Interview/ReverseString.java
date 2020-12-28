package Interview;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String s;
		System.out.println("enter any string");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		System.out.println(s);
		reverse(s);
		
		//Using string buffer to reverse
		StringBuffer sb=new StringBuffer("jyothsna");
		System.out.println(sb.reverse());
	}
	
	//Without String buffer to reverse. Time complexity is o(n/2)
	 static void reverse(String s){
		 char a[]=s.toCharArray();
		 char temp;
		 int length=s.length();
		 for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
		 {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
		 a.toString();
		 System.out.println(a);
	}

}
