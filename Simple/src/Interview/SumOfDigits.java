package Interview;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int num;
		System.out.println("enter num");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		int sum=0;
		while(num>0){
			int remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.println(sum);
	}
}
