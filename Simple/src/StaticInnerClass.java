
public class StaticInnerClass {
	
	static int data=50;
	String name="jyothsna";
	static class Lakshmi{
		
		void display(){
			System.out.println("Inside static class but not static method");
			System.out.println(data);
		}
		static void show(){
			System.out.println("Inside static class but static method");
		}
	}
	
	public static void main(String[] args) {
		
		//No obj is required to access show method b/s it is in static class and also the method is static
		StaticInnerClass.Lakshmi.show();
		
		//Obj is required to access display() method b/s it is a non-static method of static class
		StaticInnerClass.Lakshmi sl=new StaticInnerClass.Lakshmi();
		sl.display();
	}

}
