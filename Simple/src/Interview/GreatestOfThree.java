package Interview;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter the nums");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int max=(a>b?((a>c)?a:c):((b>c)?b:c)); //using ternary operator
		System.out.println(max);
		
		/*if(a>b){
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else if(b>c){
			System.out.println(b);
		}
		else
			System.out.println(c);*/
		
	}

}
