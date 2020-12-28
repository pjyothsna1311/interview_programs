
public class ThrowExample {
	
	void validate(int age){
		try{
		if(age<18)
			throw new ArithmeticException(" valid");
		else
			System.out.println("else block");
	}
		catch(ArithmeticException e){
			System.out.println("Arithmetic");
		}
	}
	

	public static void main(String[] args) {
		
		ThrowExample t=new ThrowExample();
		t.validate(10);
		System.out.println("rest of code");
	}
	
}
