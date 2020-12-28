package Interview;

import java.util.Scanner;

public class MissingNumInArray {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,7,8,10,9};
		int expectedsum=10*(10+1)/2;
		int actualsum=0;
		for(int i:a){
			actualsum+=i;
		}
		int missing=expectedsum-actualsum;
		System.out.println(missing);
		
		
	}

}
