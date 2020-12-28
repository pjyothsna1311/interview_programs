
/*  Method overloading
 *  
 *  1. Same name with diff parameters
 *  2. Same name and same parameters but the data type of parameters changes
 *   
 *   */

public class MethodOverloading {
	
	// Same name but with different signatures
	void add(int a,int b){
		
		int result=a+b;
		System.out.println(result);
		
	}
	
	void add(int a,int b,int c){
		int result=a+b+c;
		System.out.println(result);
	}
	
	static void sub(int a,int b){
		
		int result=a-b;
		System.out.println(result);
	}
	
	static void sub(int a,int b,int c){
	
		int result=a-b-c;
		System.out.println(result);
	}
	
	//Method overloading with same parameters but the datatype of parameters varies
	
	static void mul(int a,int b){
		
		int result=a*b;
		System.out.println(result);
	}
	
	static void mul(double a,double b){
		
		double result=a*b;
		System.out.println(result);
		
	}
	
	
	
	public static void main(String args[]){
		
		MethodOverloading m=new MethodOverloading();
		m.add(20, 30);
		m.add(20, 30, 40);
		sub(50, 20);  //accessing static method through class name
		MethodOverloading.sub(300, 200, 100);
		MethodOverloading.mul(2, 5);
		MethodOverloading.mul(2.5, 2.5);
		
		
		
	}

}
