/* 
 * Instance intializer block is invoked at the time of object creation. The java compiler copies the instance initializer block in the constructor after the first statement super(). So firstly, constructor is invoked.
 * */

class A{
	
	A(){
		
		System.out.println("Parent class");
	}
	
	{System.out.println("Parent class instant initializer");}
}

class B extends A{

	B(){
		
		super(); //even if we comment super JVM will automatically add super() as the first statement
		System.out.println("Child1 class");
	}
	B(int x){
		
		System.out.println(x);
	}
	
	{System.out.println("child class instant initializer");}
	{System.out.println("  instant initializer");
	System.out.println("  code initializer");
	}
	
}


public class InstanceInitializer {
	
	public static void main(String args[]){
		B b=new B();
		B b1=new B(10);
	}

} 
