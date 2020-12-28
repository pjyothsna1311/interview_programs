package Interview;

import java.util.Scanner;

public class SecondHighestInArray {
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		n=sc.nextInt();
		int a[]=new int[n];
		int max1=0;
		int max2=0;
		System.out.println("enter ele");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=2;i<n;i++){
			if(a[i]>max1)
				max2=max1;
				max1=a[i];
		}
		System.out.println("second highest" + max2);


		int aa[] = {39,78,34};
		int fmax = a[0];
		for(int j=1;j<aa.length;j++) {
			if(aa[j] > fmax) {
				fmax = aa[j];
			}
		}
		System.out.println("first highest" + fmax);

	}

}
