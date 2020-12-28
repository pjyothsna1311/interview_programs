
public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		/*try{
			
			
			int a[]=new int[5];
			a[10]=26;
			int data=50/0;
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Array");
		}
		
		catch(ArithmeticException e){
			System.out.println("Arithmetic");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		finally{
			
		}
		System.out.println("rest of code");*/
		try{  
			
			
		    try{  
		    // System.out.println("going to divide");  
		     int b =39/0;  
		    }catch(ArithmeticException e){
		    	System.out.println("arith");
		    }
		    try{  
		    int a[]=new int[5];  
		    a[5]=4;  
		    }finally{
		    	
		    }
		     
		    
		  }catch(Exception e){
			  System.out.println("handled");
		  }
		  
		  System.out.println("normal flow..");  
		 }  
		
	}
	


