package Interview;

import java.util.Scanner;

public class FibSeries {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		System.out.println("enter the length");
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		System.out.println(num1+""+num2);
		for(int i=2;i<len;i++){
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}

}
