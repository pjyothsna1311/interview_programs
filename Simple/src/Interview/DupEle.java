package Interview;

import java.util.Scanner;

public class DupEle {
	public static void main(String[] args) {
		int n;
		int k=0;
		
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter ele");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("ele are");
		for(int i=0;i<=n-1;i++)
			System.out.println(a[i]);
		
	
	/*for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]==a[j]&&b[i]!=a[i]){
				b[i]=a[i];
				//k++;
			}
			if(a[i]==a[j]){
				for(k=0;k<b.length;k++)
				{
					if(b[k]==a[i])
						continue;
					else
						b[k]=a[i];
				}
			}
		}
	}
	System.out.println("dup ele are");
	for(int i=0;i<b.length;i++)
		System.out.println(b[i]);*/
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if((a[i]==a[j])&&(i!=j))
					System.out.println("dup"+a[i]);
			}
		}

}
}
