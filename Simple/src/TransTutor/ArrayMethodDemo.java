package TransTutor;

import java.util.Scanner;

public class ArrayMethodDemo {
	
	static int[] intArray1=new int[10];
	static int[] intArray2=new int [5];
	
	/*Method to display all the integers of array*/
	void displayIntegers(){		
		for(int i=0;i<10;i++){
			System.out.println("Elements of array are"+intArray1[i]);
		}
	}
	
	/*Method to display the integers of array in reverse order*/
	void displayReverseIntegers(){
		
		for(int i=9;i>=0;i--){
			System.out.println("Elements of array in reverse order"+intArray1[i]);
		}
	}
	
	/* Method to display the sum of integers of the array*/
	void sumIntegers(){
		int sum=0;
		for(int i=0;i<10;i++){
			sum=sum+intArray1[i];
		}
		System.out.println("Sum of all the elements in array is"+sum);
		
	}
	
	/* Method to display all the elements that are lower than the limiting argument */
	void limitingArguement(int x){
		
		for(int i=0;i<10;i++){
			if(intArray1[i]<x)
				System.out.println(intArray1[i]+" is less than the limiting arguement "+x);
		}
		
	}
	
	/* Method to display all the integers that are higher than the average of the all the values of array*/
	void higherThanAvg(){
		int sum=0;
		int avg=0;
		for(int i=0;i<10;i++){
			sum=sum+intArray1[i];
		}
		avg=sum/10;
		for(int i=0;i<10;i++){
			if(intArray1[i]>avg)
				System.out.println(intArray1[i]+" is higher than the average element "+avg);
		}
	}
	
	/* Method to display the common elements between two arrays*/
	void commonOfTwoArrays(int a[],int b[]){
		
		int common=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<5;j++){
				if(a[i]==b[j]){
					System.out.println("Common element between two arrays is "+a[i]);
				}	
			}
		}
		if(common==0){
			System.out.println("No elements are commmon between two arrays");
		}
		
	}
	
	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter the elements into array1");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			intArray1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elememts into array2");
		for(int i=0;i<5;i++){
			intArray2[i]=sc.nextInt();
		}
		
		ArrayMethodDemo a=new ArrayMethodDemo();
		a.displayIntegers();
		a.displayReverseIntegers();
		a.sumIntegers();
		System.out.println("Enter the limiting arguement");
		n=sc.nextInt();
		a.limitingArguement(n);
		a.higherThanAvg();
		a.commonOfTwoArrays(intArray1,intArray2);
		
	}

}
