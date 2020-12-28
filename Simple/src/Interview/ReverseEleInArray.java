package Interview;

public class ReverseEleInArray {
	public static void main(String[] args) {
		int[] a={1,2,3};
		int temp;
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
