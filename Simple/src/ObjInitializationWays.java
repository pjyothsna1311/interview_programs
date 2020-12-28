
public class ObjInitializationWays {

	public static void main(String args[]){
		
		//we can even create multiple objects for same class and then initialize them
		
		Rectangle r=new Rectangle();
		Rectangle r1=new Rectangle();
		//Initialization through ref variable
		
		r.length=20;
		r.name="Jyo";
		r.length=50;
		r.name="Jyothsna";
		r1.length=20;
		r1.name="Jyo";
		
		System.out.println(r.length+""+r.name);
		
		//Initialization through method
		
		r.namingRectangle(30, "prema");
		r.namingRectangle(40, "trolley");
		//r.namingRectangle1(30, "prema");
		r.display();
		//r.display1();
		
		
	}
}
