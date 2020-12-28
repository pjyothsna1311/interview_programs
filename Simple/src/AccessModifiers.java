
class ABC{
	
	private int a=10;
	private void display(){
		System.out.println("display");
	}
	ABC(){
		System.out.println(a);
		display();
	}
	
	
}

public class AccessModifiers {
	
	public static void main(String args[]){
	ABC a=new ABC();
	// System.out.println(a.a);  Since variable a is private we can't access that outside the class
	}
	
}
