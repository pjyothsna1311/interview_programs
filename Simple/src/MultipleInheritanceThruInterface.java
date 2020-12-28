
interface show{
	void print();
}

interface print{
	void print();
}

class Test implements show,print{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Implementing multiple inheritance");
	}
	
}

public class MultipleInheritanceThruInterface {
	
	public static void main(String args[]){
	
	Test t=new Test();
	t.print();
	
	}
}
