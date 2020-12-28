/*

In method overloading child class will have the same method as in parent class(i.e same method name and same signature but only the implementation of method varies

*/
class Bank{
	
	 int intrst(){
		
		return 0;
	}
}

class SBI extends Bank{
	
	 int intrst(){
		
		return 20;
	}
}

class ICICI extends Bank{
	
	 int intrst(){
		
		return 40;
	}
}

class Citi extends Bank{
	
	 int intrst(){
		
		return 60;
	}
}
public class MethodOverriding {
	
	
	public static void main(String args[]){
		
		SBI s=new SBI();
		ICICI i=new ICICI();
		
		System.out.println(i.intrst());
		//System.out.println(Citi.intrst());
		
	}

}

