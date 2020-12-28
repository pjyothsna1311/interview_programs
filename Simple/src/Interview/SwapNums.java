package Interview;

import java.util.Scanner;

public class SwapNums {
	public static void main(String[] args) {
		int num1,num2,temp;
		System.out.println("enter nums");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		/*temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1+""+num2);
		*/
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1+""+num2);
	}

}
