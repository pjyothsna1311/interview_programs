package Interview;

import java.util.Scanner;

public class MaxEleInArray {
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		n=sc.nextInt();
		int a[]=new int[n];
		int max=a[0];
		System.out.println("enter ele");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=1;i<n;i++){
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
			
		
		
	}

}
