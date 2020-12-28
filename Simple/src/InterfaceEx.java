/* 
 * All the data member in interface are by default public static final
 * All the methods in interface are by default public abstract
 * Any class which implements the interface must provide the implementation for all of its abstract methods.
 * As the variables that are declared in interface are static we can access them either through obj of the class which implements 
 * the interface or through the class name itself.
 * 
 * */



interface Shape{
	
	void draw();
	int n=10;
	
}

class AB implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Implementing abs method of interface");
	}
	
}

public class InterfaceEx{
	
	public static void main(String args[]){
		
		Shape s=new AB();
		System.out.println(AB.n+""+s.n);
		s.draw();
		
	}

}
