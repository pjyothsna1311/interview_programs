
public class VariableExample {
	static int j=20; //It should not be a local variable. We should not declare this variable even inside the main method.
	int data=50;//instance variable  
	
	
	public static void main(String args[]){
		int a=10; //local variable
		VariableExample ve=new VariableExample();
		int c=ve.method();
		System.out.println("local variable values is"+c);
		j=j+20;
		int k;
		k=ve.data+50; //instance variables are accessed only through objs of the class.
		System.out.println(k);
		System.out.println("Static  variable values is"+j);
		
		System.out.println(ve.j); //static variables are accessed through objs and class names.
		System.out.println(VariableExample.j);
		
		
	}
	int method(){  
		int n=90;//local variable  
		n=n+60;
		
		return(n);
		
		
		} 
	
	

}
