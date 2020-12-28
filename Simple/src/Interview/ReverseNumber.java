package Interview;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int num;
		int reverse=0;
		int remainder;
		System.out.println("enter num");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(num>0){
			remainder=num%10;
			num=num/10;
			reverse=reverse*10+remainder;
			
			
		}
		System.out.println(reverse);
		
	}

}
