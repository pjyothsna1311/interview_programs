
public class InnerClass {
	
	int data=100;
	void show(){
		System.out.println("Outer class method");
	}
	
	//Member Inner class
	class MemberInner{
		void display(){
			System.out.println("Inner class method");
			System.out.println(data);
			show();
			//display();
			
			
		}
	}
	public static void main(String[] args) {
		InnerClass m=new InnerClass();
		m.show();
		InnerClass.MemberInner m1=m.new MemberInner();
		m1.display();
		InnerClass.MemberInner m2=m.new MemberInner();
		m2.display();
		
	}

}
