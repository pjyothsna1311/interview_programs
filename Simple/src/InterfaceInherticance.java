
interface Printable{
	
	void show();
	 
}

interface DefaultEX  {
	
	void default1();
}

interface Showable extends Printable, DefaultEX{
	
	void print();
	
}

 class Example implements Showable{

	@Override
	public
	void show() {
		// TODO Auto-generated method stub
		System.out.println("showing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing");
	}

	@Override
	public void default1() {
		// TODO Auto-generated method stub
		System.out.println("Default");
	}
	
}
public class InterfaceInherticance {
	
	public static void main(String args[]){
		
		Printable p=new  Example();
		p.show();
		Showable s=new Example();
		s.print();
		s.default1();
	
	}
	

}
