package Interview;

public class MergeSort {
	
	private int[] a;
	private int[] temp;
	private int length;
	public static void main(String[] args) {
		int[] a={10,5,4,30,40,35};
		MergeSort m=new MergeSort();
		m.sort(a);
		
		
	}
	
	public void sort(int[] a){
		this.a=a;
		this.length=length;
		this.temp=new int[length];
		doMergeSort(0, length-1);
	}
	private void doMergeSort(int lowerIndex,int higherIndex){
		if(lowerIndex<higherIndex){
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle+1,higherIndex);	
			mergeParts(a,lowerIndex,middle,higherIndex);
		}
		
		
	}
	private void mergeParts(int a[],int lowerIndex,int middle,int higherIndex){
		int n1=middle-lowerIndex+1;
		int n2=higherIndex-middle;
		int[] l=new int[n1];
		int[] r=new int[n2];
		for(int i=0;i<n1;i++)
			l[i]=a[lowerIndex+i];
		for(int j=0;j<n2;j++)
			r[j]=a[middle+1+j];
		int i=0,j=0;
		int k=lowerIndex;
		while(i<n1&&j<n2){
			if(l[i]<r[j]){
				a[k]=l[i];
				i++;
			}
			else{
				a[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a[k]=l[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k]=r[j];
			j++;
			k++;
		}
	
	
	
	}
}
