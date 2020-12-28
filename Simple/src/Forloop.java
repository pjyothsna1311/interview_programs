
public class Forloop {
	public static void main(String args[]){
		int a=10;
		for(int i=1;i<=a;i++){ //simple for loop
			System.out.println(i);
		}
		
		int arr[]={1,2,3};
		for (int i : arr) { //foreach loop
			System.out.println(i);
			
		}
		int i=10;
		int j=20;
	
		aa:
			for(i=1;i<10;i++){
				for(j=1;j<20;j++)
					if(i>j)
						break aa;
					else
						System.out.println(i);
			}
				
	}

}
