package Pack;
import myPack.*;

public class D extends B {
	
	public static void main(String args[]){
		
		D d=new D();
		d.display();  // It can the protected method of class B. If we need to protected access 
		//modifier the class must extend that class
		
	}

}
