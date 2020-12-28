package Interview;

import java.util.Arrays;

public class ArraySortWithOutCollections {
	
	public static void main(String[] args) {
		int[] a={10,60,50,5,1,30,0,100};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

		//Sorting with collections
		/*Arrays.sort(a);
		for(int i : a) {
			System.out.println(i);
		}*/
	}

}
