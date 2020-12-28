
interface Showable1{
	
	//Interface that is created inside another interface should be public only. 
	 interface printable{
		void print();
		int data=100;
	}
}

class Padamata{
	
	//Interface that is created inside a class can have access modifiers
	protected interface display{
		void display();
	}
}

public class NestedInterface implements Showable1.printable,Padamata.display{
	
	public static void main(String[] args) {
		
		Showable1.printable sp=new NestedInterface();
		sp.print();
		Padamata.display pd=new NestedInterface();
		pd.display();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Nested interface inside another interface"+data);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Nested interface inside a class");
	}

}
