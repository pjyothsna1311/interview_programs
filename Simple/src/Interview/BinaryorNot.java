package Interview;

import java.util.Scanner;

public class BinaryorNot {

	public static void main(String[] args) {
		int n;
		int flag=0;
		System.out.println("enter any num");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		//System.out.println(111%10);
		while(n!=0){
			if(n%10>1)
				flag=1;
			n=n/10;
			
	}
		if(flag==1)
			System.out.println("not binary");
		else
			System.out.println("binary");
}
}

