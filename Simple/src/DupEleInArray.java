import java.util.Scanner;


public class DupEleInArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("enter ele");
		for(int i=0;i<a.length;i++){
			Scanner s=new Scanner(System.in);
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if((a[i]==a[j])&&(i!=j)){
					System.out.println("dup ele"+a[j]);
				}
			}
		}
	}
}
