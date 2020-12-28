import java.io.IOException;
import java.sql.SQLException;


public class ExceptionPropogation {
	
	void validate(int age){
		if(age<18){
			System.out.println("if block");
			throw new ArithmeticException("not valid");
			
		}
			
		else
			System.out.println("else block");
	}
	
	void m(){
		
		validate(13);
		
	}
	
	void n(){
			try{
			m();
			
			}
			catch(ArithmeticException g){
				System.out.println(" handled");
			}
			
		
		
		
	}
	
	//Checked exceptions wii not ne propogated. Compiler error will be thrown
	/*void k(){
		throw new SQLException("exception");
	}
	
	void l(){
		try{
			k();	
		}
		catch(Exception e){
			System.out.println(("handled"));
		}
		
	}
	*/
	public static void main(String[] args) {
		
		ExceptionPropogation e=new ExceptionPropogation();
		
			e.n();	
		
		
		//e.l();
		System.out.println("rest of code");
		
		
	}

}

/*Propogated exceptions can also be handled in main method as follows
 * 
 * 
 * public static void main(String[] args) {
		
		ExceptionPropogation e=new ExceptionPropogation();
		try{
			e.n();	
		}
		catch(ArithmeticException g){
			System.out.println("main handled");
		}
		*/
