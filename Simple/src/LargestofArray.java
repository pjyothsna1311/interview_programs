import java.util.Scanner;


public class LargestofArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("enter ele");
		for(int i=0;i<a.length;i++){
			Scanner s=new Scanner(System.in);
			a[i]=s.nextInt();
		}
		int largest=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>largest)
				largest=a[i];
			else
				largest=a[0];
		}
		System.out.println(largest);
		
	}

}
