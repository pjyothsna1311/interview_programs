
/* 
 * 
 *  We can overload java main method but JVM calls the main() methos that receives string as arguments only */

public class OverloadMainMethod {
	
public static void main(int args[]){
		
		System.out.println("Int");
	}

public static void main(String args[]){
		
		System.out.println("Main method");
	}
	public static void main() {
		System.out.println("Empty args");
	}
	
	
	
}
