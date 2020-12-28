package Interview;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int n;
		System.out.println("enter num");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int fact=1;
		while(n>1){
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}
}
