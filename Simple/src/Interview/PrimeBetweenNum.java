package Interview;

import java.util.Scanner;

public class PrimeBetweenNum {
	public static void main(String[] args) {
		int min,max;
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter range");
		min=s.nextInt();
		max=s.nextInt();
		for(int i=min;i<=max;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
					
			}
			if(flag==1)
				System.out.println(i);
		}
	}

}
