/*   
 * Abstract class can have abstract(method with out body) as well as non abstract(method with body) methods.
 * Abstract class must be extended.
 * Child class which inherits abstract class must implement all its abstract methods.
 * We can't instantiate abstract class (i.e we can't create obj for abstract class)
 * Non abstract methods of abstract classs can be invoked by its child class obj.
 */

abstract class Bike{
	
	abstract void run();
	void gearChange(){
		System.out.println("gear changed");
	}
	
	Bike(){
		System.out.println("Bike running successfully");
	}
}

class Honda extends Bike{
	// Here compiler will automatically create a default constructor named as Bike and will add super() as its first statement.
	void run(){
		System.out.println("Honda is running");
	}
}


public class AbstractClassEx {
	
	public static void main(String args[]){
		
		//Bike b=new Bike();
		Bike b=new Honda();
		b.run();
		b.gearChange();
		
		Honda h=new Honda();
		h.run();
		h.gearChange();
	}

}
