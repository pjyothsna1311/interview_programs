import java.util.Scanner;


public class RotateArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("enter ele");
		for(int i=0;i<a.length;i++){
			Scanner s=new Scanner(System.in);
			a[i]=s.nextInt();
		}
		int k=a.length;
		for(int i=0;i<a.length;i++){
			
			b[i]=a[k-1];
			k--;
			
		}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}

}
