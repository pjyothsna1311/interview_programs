import java.io.IOException;

class Excep{
	
	void validate(){
		System.out.println("parent");
		int data=100/0;
	}
	
	void msg() throws Exception{
		
		int a[]=new int[5];
		a[10]=20;
		
	}
	
}

class Example1 extends Excep{

	/* If the parent class doesn't declare an exception then child class can't declare Checked exceptions but it can declare 
	 * unchecked exceptions
	 * (non-Javadoc)
	 * @see Excep#validate()
	 */
	void validate() throws ArithmeticException{
		
		System.out.println("child");
		try{
		super.validate();
		}
		catch(ArithmeticException e){
			System.out.println("handled");
		}
	}
	
	
	/* If the parent class declares an excep then the child class can declare the same excep or no exception or subclass of 
	 * parent's class excep, but it should not declare the parent exception of parent class (i.e if parent class declares 
	 * ArrayIndexOutOfBound Exception then child class can't declare Exception which is the parent of ArrayIndexOutOfBoundException
	 * 
	 * (non-Javadoc)
	 * @see Excep#msg()
	 */
	void msg() throws ArrayIndexOutOfBoundsException{
		
		//super.msg();
		System.out.println("chils class msg method");
		try{
		super.msg();
		}
		catch(Exception e){
			System.out.println("array handled");
		}
	}
	
}

public class ExcepHandlingMethodOverriden {
	
	public static void main(String[] args) {
		
		Example1 e=new Example1();
		e.validate();
		System.out.println("rest of code");
		Excep e1=new Example1();
		e.msg();
		
		
	}

}
