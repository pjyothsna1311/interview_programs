package Interview;

import java.util.Scanner;

public class MatrixMul {
public static void main(String[] args) {
	int m,n,p,q;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rows and cols of matrix a");
	m=sc.nextInt();
	n=sc.nextInt();
	System.out.println("enter rows and cols of matrix b");
	p=sc.nextInt();
	q=sc.nextInt();
	int[][] a=new int[m][n];
	int[][] b=new int[p][q];
	int[][] c=new int[m][q];
	System.out.println("enter A matrix ele");
	
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter B matrix ele");
	
	for(int i=0;i<p;i++){
		for(int j=0;j<q;j++){
			b[i][j]=sc.nextInt();
		}
	}
	if(n!=p){
		System.out.println("mul not possible");
		
	}
	else{
		for(int i=0;i<m;i++){
			for(int j=0;j<q;j++){
				for(int k=0;k<n;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
	}
	for(int i=0;i<m;i++){
		for(int j=0;j<q;j++){
			System.out.println(c[i][j]);
		}
	}
	
	
}
}
