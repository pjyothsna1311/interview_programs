

class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  
public class CustomExcep {
	
	void validate(int age) throws InvalidAgeException  {
		
		if(age<13)
			throw new InvalidAgeException("not a valid age");
		else
			System.out.println("else block");
		
	}

	public static void main(String[] args) {
		
		CustomExcep c=new CustomExcep();
		try{
		c.validate(10);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("handled"+e);
		}
	}

}