
public class StaticAndInstance {
	
	static int count=0;
	int count1=0;
	
	StaticAndInstance(){
		count++;
		count1++;
		
		System.out.println("Static"+count+"Instance"+count1);
		
	}
	
	
	
	public static void main(String args[]){
		
		StaticAndInstance s1=new StaticAndInstance();
		StaticAndInstance s2=new StaticAndInstance();
		StaticAndInstance s3=new StaticAndInstance();
		
		
	}

}
