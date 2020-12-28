
public class Fibnocci {
	static int l=0;
	static int m=1;
	static int j=1;
	public static void main(String args[]){
		Fibnocci f=new Fibnocci();
		int num=10;
	
		int a=0;
		int b=1;
		int i=1;
		System.out.print(a+ ""+b);
		while(i<9){
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			++i;
			
		}	
		f.method(num);
		
	}
	void method(int n){
		System.out.println(l+""+m);
		
		while(j<n){
			int p=l+m;
			l=m;
			m=p;
			System.out.println("fib nums are"+p);
			++j;
			
		}
		
	}
}
