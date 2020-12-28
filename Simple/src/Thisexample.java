
public class Thisexample {
	
	int id;
	String name;
	
	Thisexample(int id,String name){
		
		/*id=id;
		name=name;*/  //parameters (formal arguments) and instance variables are same. So, we are using this keyword to distinguish local variable and instance variable.
		
		//refer current class instance variable
		
		this();  //refer current class constructor using this() and this is also like calling default construtor from parameterized constructor
		this.id=id;
		this.name=name;
		
		
	}
	
	//refering current class method using this keyword
	void display(){
		System.out.println(id+""+name);
		this.m(); //this is same as m();
	}
	
	void m(){
		System.out.println("Hi");
		
	}
	
	Thisexample(){
		
		System.out.println("current class construtor");
	}
	
	
	
public static void main(String args[]){
		
		Thisexample t=new Thisexample(20,"jyo");
		t.display();
		
		
	}
	
}
	
	
