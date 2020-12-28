package Interview;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		int num;
		boolean prime=false;
		System.out.println("enter num");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				prime=true;
				break;
		}
		}
		if(prime==false)
			System.out.println("num is prime");
		else
			System.out.println("num is not prime");
	}
}
