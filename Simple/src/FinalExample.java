class C{
	
	final int a=20;
	final int c;
	static final int d;
	int b=30;
	void change(){
		//a=30;      we can't change final variable
		b=40;
		
	}
	
	final void show(){          
		System.out.println("we can inherit the final methods");
	}
	
	final void print(){
		System.out.println("inside parent class");
	}
	
	/*final C(){  // we should not make the constructor as final
		
	}*/
	
	C(){
		c=60;    //Blank final variable can be initialized only in constructor
		
	}
	static{
		d=100;    //static final variable can be initialized only in static block
	}
}

class D extends C{
	
	/*final void print(){      we can't override final methods.
		
	}*/
	
}

final class EX{
	
}

/*class E extends EX{     we can't inherit the final class
	
}*/

public class FinalExample {

	public static void main(String args[]){
		
		D d= new D();
		d.show();    // we can inherit final method
		d.print();
		System.out.print(d.c);
	}
}
