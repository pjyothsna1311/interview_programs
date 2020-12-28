package Interview;

public class ConsecutiveNumWithHighestSum {
	
	public static void main(String[] args) {
		int[] a={1,10,2,5,7,70,100,10};
		int sum=0;
		int maxsum=0;
		int temp1=0,temp2=0;
		for(int i=1;i<a.length;i++){
			sum=a[i-1]+a[i];
			if(sum>maxsum){
				maxsum=sum;
				temp1=i-1;
				temp2=i;
			}
		}
		System.out.println("max sum is"+maxsum+"occured with"+a[temp1]+""+a[temp2]);
	}

}
