import java.util.Scanner;


public class ArrayExample {
	
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements for the array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++){
			
			a[i]=s.nextInt();
			
		}
		System.out.println("array elements are");
		for(int i=0;i<n;i++){
			
			System.out.println(a[i]);
			
		}
		Class c=a.getClass();
		System.out.println(c);
		String name=c.getName();  
		  
		System.out.println(name);  
		
	}

}
