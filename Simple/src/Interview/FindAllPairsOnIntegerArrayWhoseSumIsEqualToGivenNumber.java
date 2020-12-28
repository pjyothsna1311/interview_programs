package Interview;

public class FindAllPairsOnIntegerArrayWhoseSumIsEqualToGivenNumber {
	
	public static void main(String[] args) {
		int[] a={2,3,3,3,2,4,1,5};
		int n=6;
		int sum=0;
		int temp1,temp2=0;
		for(int i=1;i<a.length;i++){
			sum=a[i-1]+a[i];
			if(sum==n){
				temp1=i-1;
				temp2=i;
				System.out.println(a[i-1]+"  "+a[i]);
			}
			
		}
		
		
	}

}
